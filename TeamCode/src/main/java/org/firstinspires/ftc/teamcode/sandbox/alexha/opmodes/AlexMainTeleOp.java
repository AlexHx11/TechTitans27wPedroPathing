package org.firstinspires.ftc.teamcode.sandbox.alexha.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.sandbox.alexha.bot.AlexBot;

@TeleOp(name="OffSeason TeleOp")
public class AlexMainTeleOp extends OpMode {
    AlexBot bot;

    public void init() {
        bot = new AlexBot(hardwareMap);
    }

    public void loop() {
        // Drive Train (x, y, turn)
        bot.driveTrain.setDrivePower(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);

        // Intake
        if (gamepad1.left_trigger_pressed) {
            bot.intake.turnIntakeOn();
        } else if (gamepad1.left_bumper) {
            bot.intake.turnOuttakeOn();
        } else {
            bot.intake.turnIntakeOff();
        }

        bot.update();
    }
}
