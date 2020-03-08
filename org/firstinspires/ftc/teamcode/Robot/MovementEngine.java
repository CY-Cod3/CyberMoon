package org.firstinspires.ftc.teamcode.Robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.VoltageSensor.VoltageSensor;

public class MovementEngine {

    //The Hardware Map
    private HardwareMap hardwareMap;

    //Frontal Motors
    private DcMotor Front_left;
    private DcMotor Front_right;

    //Backside Motors
    private DcMotor Back_left;
    private DcMotor Back_right;

    //General movement directions
    enum Directions {
        FORWARD , BACKWARD,
        LEFT, RIGHT,
        ROTATE_LEFT, ROTATE_RIGHT,
        DIAG_FRONT_LEFT, DIAG_FRONT_RIGHT,
        DIAG_BACK_LEFT, DIAG_BACK_RIGHT
    };

    //Voltage Sensor , used for motor control
    private VoltageSensor sensor;

    //Init function
    public void init(HardwareMap ahwMap){
        //Call to voltage_sensor init
        sensor.init(ahwMap);

        //Set local hardwareMap
        hardwareMap = ahwMap;

        //Map Front motors
        Front_left = hardwareMap.get(DcMotor.class , "Front_left");
        Front_right = hardwareMap.get(DcMotor.class , "Front_right");

        //Map backside motors
        Back_left = hardwareMap.get(DcMotor.class , "Back_left");
        Back_right = hardwareMap.get(DcMotor.class , "Back_right");
    }

    //Function to set a general Direction of movement
    public void setMovementDirection( Directions direction ){
        switch (direction) {
            case FORWARD: {

            }

            case BACKWARD: {

            }

            case LEFT: {

            }

            case RIGHT: {

            }

            case ROTATE_LEFT: {

            }

            case ROTATE_RIGHT: {

            }

            case DIAG_FRONT_LEFT: {

            }

            case DIAG_FRONT_RIGHT: {

            }

            case DIAG_BACK_LEFT: {

            }

            case DIAG_BACK_RIGHT: {

            }

            default: {
                break;
            }
        }
    }

    //Function to apply power to each individual motor
    public void applyIndividualPower( double powerFL , double powerFR , double powerBL , double powerBR){
        Front_left.setPower(powerFL);
        Front_right.setPower(powerFR);

        Back_left.setPower(powerBL);
        Back_right.setPower(powerBR);
    }
}
