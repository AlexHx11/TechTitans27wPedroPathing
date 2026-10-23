package org.firstinspires.ftc.teamcode.techTitans.bot.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {

    // intake motor
    private final DcMotorEx intakeMotor;
    private static final double intakePower = 0.5;
    private static final double outtakePower = 0.3;

    // states
    private enum IntakeState {
        INTAKE_ON,
        INTAKE_OFF,
        OUTTAKE_ON
    }
    private IntakeState currState = IntakeState.INTAKE_OFF;

    public Intake(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotorEx.class, "intakeMotor");

        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    // Setters
    public void turnIntakeOn() { currState = IntakeState.INTAKE_ON; }

    public void turnOuttakeOn() { currState = IntakeState.OUTTAKE_ON; }

    public void turnIntakeOff() { currState = IntakeState.INTAKE_OFF; }

    // Update
    public void update() {
        switch (currState) {
            case INTAKE_ON:
                intakeMotor.setPower(intakePower);

            case OUTTAKE_ON:
                intakeMotor.setPower(outtakePower);

            case INTAKE_OFF:
                intakeMotor.setPower(0);
        }
    }

    public void stop() {
        intakeMotor.setPower(0);
    }
}
