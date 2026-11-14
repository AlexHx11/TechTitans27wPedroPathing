package org.firstinspires.ftc.teamcode.techTitans.bot.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Shooter {

    // Shooter constants
    private final DcMotorEx shooterMotor;
    final double shooterPower = 0.8;

    // states
    private enum ShootingState {
        SHOOTING,
        NOT_SHOOTING
    }

    ShootingState currentState = ShootingState.NOT_SHOOTING;

    // constructor
    public Shooter(HardwareMap hwMap) {
        shooterMotor = hwMap.get(DcMotorEx.class, "shooterMotor");

        shooterMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    // setter methods
    public void turnShooterOn() {
        currentState = ShootingState.SHOOTING;
    }

    public void turnShooterOff() {
        currentState = ShootingState.NOT_SHOOTING;
    }

    public void update() {

        switch (currentState) {
            case SHOOTING:
                shooterMotor.setPower(shooterPower);
            case NOT_SHOOTING:
                shooterMotor.setPower(0);
        }

    }

    public void stop() {
        shooterMotor.setPower(0);
    }


}
