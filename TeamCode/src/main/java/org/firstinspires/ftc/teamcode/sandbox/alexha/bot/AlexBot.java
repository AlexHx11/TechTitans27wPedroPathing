package org.firstinspires.ftc.teamcode.sandbox.alexha.bot;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.sandbox.alexha.bot.subsystems.AlexDriveTrain;
import org.firstinspires.ftc.teamcode.sandbox.alexha.bot.subsystems.AlexIntake;

public class AlexBot {
    // Subsystems
    public final AlexDriveTrain driveTrain;
    public final AlexIntake intake;

    // Constructor passes hwMap into subsystems
    public AlexBot(HardwareMap hwMap) {
        driveTrain = new AlexDriveTrain(hwMap);
        intake = new AlexIntake(hwMap);
    }

    // Update the bot
    public void update() {
        driveTrain.update();
        intake.update();
    }

    public void stop() {
        driveTrain.stop();
        intake.stop();
    }
}
