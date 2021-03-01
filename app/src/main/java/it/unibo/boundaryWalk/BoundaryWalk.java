package it.unibo.boundaryWalk;

public class BoundaryWalk {

    public void boundaryWalk(){
        MoveVirtualRobot appl = new MoveVirtualRobot();
        int i = 0;
        boolean collision = false;
        for(i=0; i<4; i++){
            while(!collision)
                collision = appl.moveForward(600);
            appl.moveLeft(150);
            collision = false;
        }
    }

    public void boundaryWalkRandomPositionBoundary(){
        MoveVirtualRobot appl = new MoveVirtualRobot();
        int i = 0;
        boolean collision = false;
        //Make the robot collide and turn it to the left to place it in a correct starting position
        while(!collision)
            collision = appl.moveForward(600);
        appl.moveLeft(150);
        System.out.println("[Robot] Placed in a correct starting position!");
        //If exceptional situation, turn the robot to the left another time
        if(appl.moveForward(50)) {
            appl.moveLeft(150);
            System.out.println("[Robot] Exceptional situation!");
        }else
            appl.moveBackward(50);
        System.out.println("[Robot] Exceptional situation checked!");
        //Now BoundaryWalk
        collision = false;
        for(i=0; i<4; i++){
            while(!collision)
                collision = appl.moveForward(600);
            appl.moveLeft(150);
            collision = false;
        }
    }

    public static void main(String[] args)   {
        BoundaryWalk app = new BoundaryWalk();
        System.out.println("Hello my friend!");
        app.boundaryWalkRandomPositionBoundary();
        System.out.println("Giretto turistico finito!");

    }
}
