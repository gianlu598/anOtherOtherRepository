package it.unibo.boundaryWalk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBoundaryWalk {
    private MoveVirtualRobot appl;
    private BoundaryWalk app;

    @Before
    public void systemSetUp() {
        System.out.println("TestBoundaryWalk | setUp: robot should be at HOME-DOWN ");
        app = new BoundaryWalk();
        appl = new MoveVirtualRobot();
    }

    @After
    public void  terminate() {
        System.out.println("%%%  TestBoundaryWalk |  terminates ");
    }

    @Test
    public void testPlanHypothesisOne() {
        //Hypothesis 1 -> w*lw*lw*lw*l
        System.out.println("testPlan Hypothesis 1 | testWork ");
        StringBuilder sb = new StringBuilder("");
        String result = "";
        int i = 0;
        boolean collision = false;
        for(i=0; i<4; i++){
            while(!collision) {
                collision = appl.moveForward(600);
                sb.append('w');
            }
            appl.moveLeft(150);
            sb.append('l');
            collision = false;
        }
        result = sb.toString();
        assertTrue( result.matches("w+lw+lw+lw+l")  );
    }



}
