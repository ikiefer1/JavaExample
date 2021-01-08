import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Derek Green (minor modification of the Circle class written by Michael Kolling and David J. Barnes) 
 * @version 1.0  (Feb 15, 2004)
 * Revised by William Smith Summer 2012
 */

public class Ball
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private int notUsed;
    private int branch2;

    /**
     * Create a new ball at default position with default color.
     */
    public Ball()
    {
        diameter = 30;
        xPosition = 20;
        yPosition = 20;
        color = "blue";
        isVisible = true;
        draw();
    }

    /**
     * Make this ball visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this ball invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        //erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        //erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the ball horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the ball vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    //-------------------- COSC 1010  LAB 4, add your work here ------------------------
    //----------------------------------------------------------------------------------
    //(Your Name goes here)
    //Lab 4
    //----------------------------------------------------------------------------------

    /**
     * Bounce the ball around the window.
     */
    public void bounceTheBall(int time, int speed)
    {
        Canvas canvas = Canvas.getCanvas();                                 //DO NOT CHANGE         
        int windowWidth = canvas.getWidth();// the width of the window      //DO NOT CHANGE
        int windowHeight = canvas.getHeight();// the height of the window   //DO NOT CHANGE
        int deltaX = 1;// +/- velocity in x-direction                       //DO NOT CHANGE
        int deltaY = 1;// +/- velocity in y-direction                       //DO NOT CHANGE

        //-----------------------------------------------------------------------
        if(speed<=10 || speed<=1)
        {
        deltaX=speed*deltaX;
        deltaY=speed*deltaY;
        }//your speed validation code goes here
        //-----------------------------------------------------------------------

        for(int i = 0; i < time; i++)// repeat the following process        //DO NOT CHANGE
        {
          if(xPosition+diameter>=windowWidth || xPosition<=0)
          {
            deltaX=-deltaX;
            }
          if(yPosition+diameter>=windowHeight || yPosition<=0)
          {
            deltaY=-deltaY;
            }
            //-----------------------------------------------------------------------
            //your collision test code goes here
            //test if the ball has collided with the top or bottom, if so reflect it
            //test if the ball has collided with a side, if so reflect it
            //-----------------------------------------------------------------------

            
            xPosition += deltaX;//moves the ball 1 deltaX unit in the x-direction //DO NOT CHANGE
            yPosition += deltaY;//moves the ball 1 deltaY unit in the y-direction //DO NOT CHANGE
            draw();// draws the ball at the new position                          //DO NOT CHANGE
        }
    }

    public int changeColor(int different)
    {
      if (different==1)
      {
        color= "red";
        draw();
        }
    
    }

    //public -----------------------------------------------------------------------
    //add your changeColor method here.
    //Valid colors will be in the range 1 - 6 for the six colors.
    //You may decide which number (1-6) maps to which color.
    //If the value is not in this range, make the circle red.
    //-----------------------------------------------------------------------

    //-------------------- END OF LAB 4 ------------------------------------------------

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        if(newColor.equals("yellow") || newColor.equals("blue") || newColor.equals("green") || newColor.equals("magenta") || newColor.equals("black")){
            color = newColor;
        } else {
            color = "red"; //make red the default
        }
        draw();
    }

    /*
     * Draw the ball with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    diameter, diameter));
            canvas.wait(10);
        }
    }

    /*
     * Erase the ball on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    /**
     * What the for-loop is really doing (approximately.)
     */
    public void lameWayToMoveABall()
    {
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
        moveHorizontal(1);
        moveVertical(1);
    }
}
