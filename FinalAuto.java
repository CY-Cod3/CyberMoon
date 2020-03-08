import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.AutonomousModules.Modules;

@Autonomous
public class FinalAuto extends LinearOpMode {



    Modules modules;

    @Override
    public void runOpMode(){

        modules.init(hardwareMap);

        waitForStart();
        while(opModeIsActive()){
            modules.runAutonomousMode(1,2,4,6,true,1);
        }
    }

}
