package org.firstinspires.ftc.teamcode.AutonomousModules;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Robot;

public class Modules {

    //Initialize a robot to perform the tasks
    Robot robot = new Robot();

    //Init function
    public void init(HardwareMap ahwMap){

        //Perform init on the robot
        robot.init(ahwMap);
    }

    //Main function
    public void runAutonomousMode(
            int startingPos , int skyStones , int stones , int onFoundation , boolean reposition , int parkingPos
    ) {

    }
}
