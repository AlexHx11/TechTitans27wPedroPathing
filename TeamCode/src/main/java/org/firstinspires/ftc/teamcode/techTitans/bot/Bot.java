package org.firstinspires.ftc.teamcode.techTitans.bot;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.techTitans.bot.subsystems.DriveTrain;

/* Bot File -
*  this file is meant to glue all the subsystems together, when initializing
* opmodes, use the methods from this class */
// When adding a new subsystem, add the subsystem under every method with its respective call
public class Bot {

    // add new subsystems here
    public final DriveTrain driveTrain;

    // Constructor passes hwMap into subsystems
    public Bot(HardwareMap hwMap) {
        driveTrain = new DriveTrain(hwMap);
    }

    // Continuously update the bot to check state
    public void update() {
        driveTrain.update();
    }

    public void stop() {
        driveTrain.stop();
    }
}
