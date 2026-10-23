package org.firstinspires.ftc.teamcode.techTitans.opModes.teleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.techTitans.bot.Bot;

/* Main TeleOp -
* The teleop is the part that runs when the drivers pick up the controllers.
* For our team, we are going to use OpMode as opposed to linear opmode,
* linear opmode is better for autos, ill explain this another time */

// In the driver station, "name=" is where the name of the opmode goes which is
// what we'll find in the driver station.
@TeleOp(name="Main TeleOp")
public class Main extends OpMode {
    Bot bot;

    public void init() {
        bot = new Bot(hardwareMap);
    }

    public void loop() {
        // Drive Train (x, y, turn)
        bot.driveTrain.setDrivePower(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);

        // Update the bot and its state
        bot.update();
    }
}
