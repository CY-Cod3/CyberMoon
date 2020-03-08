package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.CameraDetector.CameraDetector;

public class Robot {
    //The chassis of the robot
    public MovementEngine chassis;

    //The scissor
    public ScissorEngine scissor;

    //The phone camera required for detection
    public CameraDetector detector;

    //Init function
    public void init(HardwareMap ahwMap){

        //Initialize engines
        chassis.init(ahwMap);

        //Initialize cameras
        detector.init(ahwMap);

    }
}
