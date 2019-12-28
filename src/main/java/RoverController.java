import com.sun.deploy.util.StringUtils;
import java.util.logging.Logger;

public class RoverController {

    private static Logger logger = Logger.getLogger("RoverController");
    private Rover rover;
    public RoverController(Rover rover) {
        this.rover = rover;
    }

    public String execute(String mission){
        String args[] = StringUtils.splitString(mission, ",");

        int argNum = args.length;

        if(argNum >= 5){
            Area area = new Area(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
            rover.land(area, Integer.valueOf(args[2]), Integer.valueOf(args[3]), args[4]);
        }
        for(int i = 5; i < argNum; i++){
            if(args[i].equals("M")){
                rover.move();
            }
            if(args[i].equals("L")){
                rover.changeDirection("L");
            }
            if(args[i].equals("R")){
                rover.changeDirection("R");
            }
        }
        logger.info("now the rover position is : "+rover.getPosition());
        return rover.getPosition();
    }
}
