public class Rover {

    private String position = "";
    private int x = 0;
    private int y = 0;
    private static final String allDirection = "SWEN";
    private String actualDirection = "";
    public String getPosition(){
        position = "" + x + y + actualDirection;
        return position;
    }

    public void land(Area area, int initX, int initY, String direction){
        int xLength = area.getX();
        int yLength = area.getY();
        if(initX > xLength || initY > yLength){
            throw new IllegalArgumentException("初始位置超出区域！");
        }
        if(allDirection.indexOf(direction) == -1){
            throw new IllegalArgumentException("方向错误！");
        }
        x = x + initX;
        y = y + initY;
        actualDirection = direction;
    }

    public void move(){
        if("S".equals(actualDirection)){
            y = y - 1;
        }
        if("N".equals(actualDirection)){
            y = y + 1;
        }
        if("E".equals(actualDirection)){
            x = x + 1;
        }
        if("W".equals(actualDirection)){
            x = x - 1;
        }
    }

    public void changeDirection(String change){
        if("L".equals(change)){
            if("S".equals(actualDirection)){
                actualDirection = "E";
            }
            if("E".equals(actualDirection)){
                actualDirection = "N";
            }
            if("N".equals(actualDirection)){
                actualDirection = "W";
            }
            if("W".equals(actualDirection)){
                actualDirection = "S";
            }
        }
        if("R".equals(change)){
            if("S".equals(actualDirection)){
                actualDirection = "W";
            }
            if("W".equals(actualDirection)){
                actualDirection = "N";
            }
            if("N".equals(actualDirection)){
                actualDirection = "E";
            }
            if("E".equals(actualDirection)){
                actualDirection = "S";
            }
        }
    }

}
