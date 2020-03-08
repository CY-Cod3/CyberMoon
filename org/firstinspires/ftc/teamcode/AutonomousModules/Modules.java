package org.firstinspires.ftc.teamcode.AutonomousModules;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Robot.Robot;

public class Modules {

    //Initialize a robot to perform the tasks
    private Robot robot = new Robot();

    //Init function
    public void init(HardwareMap ahwMap){

        //Perform init on the robot
        robot.init(ahwMap);
    }

    //Skystone position
    int pos = 0;

    //Function used to handle game element movement
    private void grabElement( int elementPos , boolean score ){
        switch(elementPos){
            case 1: {

            }

            case 2: {

            }

            case 3: {

            }

            case 4: {

            }

            case 5: {

            }

            case 6: {

            }
        }
    }

    //Main function
    public void runAutonomousMode(
            int startingPos , int skyStones , int stones , int onFoundation , boolean reposition , int parkingPos
    ) {
        //Regardless of config, skystone position is always required
        pos = robot.detector.getPosition();

        //Temporary variable to count skystones / stones
        int elementsDelivered = 0;

        //Temporary variable to count elements on foundation
        int elementsScored = 0;

        //Temporary array of available stones
        int[] stonesList = new int[]{ 1, 2, 3, 4, 5, 6 };

        //Get optimal route based on requests

        //Get skystones first
        while(elementsDelivered < skyStones){
            //Will only activate if skystones is at least 1

            //Get first skystone
            if(elementsScored < onFoundation){
                grabElement(pos , true);

                elementsScored++;
            } else {
                grabElement(pos , false);
            }

            //Increment
            elementsDelivered++;

            //Remove element from array
            stonesList[pos-1] = 0;

            //Modify pos , so it corresponds to the second skystone
            pos = pos + 2;
        }

        //Reset pos
        pos = 0;

        while(elementsDelivered < skyStones + stones){
            //Get the next element
            if(stonesList[pos] != 0 ){

                if(elementsScored < onFoundation){
                    grabElement(pos , true);

                    elementsScored++;
                } else {
                    grabElement(pos , false);
                }

                //Increment
                elementsDelivered++;

                //Remove element from array
                stonesList[pos] = 0;

            } else {
                pos++;
            }
        }

        //After that , reposition foundation

        if(reposition){

        }

        //Finally park robot

        switch(parkingPos){
            case 1: {

            }

            case 2: {

            }
        }
    }
}
