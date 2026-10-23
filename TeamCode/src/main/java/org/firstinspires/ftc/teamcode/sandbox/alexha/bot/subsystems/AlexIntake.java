package org.firstinspires.ftc.teamcode.sandbox.alexha.bot.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class AlexIntake {

    // Hardware Declaration
    private final DcMotorEx intakeMotor;

    // Power Constants
    private static final double INTAKE_POWER = 0.5;
    // Keep outtake power positive, its already flipped in the update loop
    private static final double OUT_POWER = 0.3;

    // States
    public enum IntakeState {
        INTAKE_ON,
        OUTTAKE_ON,
        INTAKE_OFF
    }

    // Set Current State
    private IntakeState currentIntakeState = IntakeState.INTAKE_OFF;

    // Constructor (Initialization)
    public AlexIntake(HardwareMap hwMap) {
        intakeMotor = hwMap.get(DcMotorEx.class, "intake motor");

        intakeMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    // Setters, makes setting states cleaner + good practice (for abstraction and encapsulation)
    public void turnIntakeOn() {
        currentIntakeState = IntakeState.INTAKE_ON;
    }

    public void turnIntakeOff() {
        currentIntakeState = IntakeState.INTAKE_OFF;
    }

    public void turnOuttakeOn() {
        currentIntakeState = IntakeState.OUTTAKE_ON;
    }

    // Update loop
    public void update() {
        switch (currentIntakeState) {
            case INTAKE_OFF:
                intakeMotor.setPower(0);

            case INTAKE_ON:
                intakeMotor.setPower(INTAKE_POWER);

            case OUTTAKE_ON:
                intakeMotor.setPower(-OUT_POWER);
        }
    }

    public void stop() {
        turnIntakeOff();
    }
}
