package blue.mdc.event.constants;

import blue.mdc.event.*;
/**
 * A bunch of Constant all in one place
 * 
 * @author Carlos Abraham
 * 
 * @see blue.mdc.event.Event
 * @see blue.mdc.event.Intro
 * @see blue.mdc.event.MainView
 * @see blue.mdc.event.AddEvent
 * @see blue.mdc.event.AddTraveler
 */

public class Constants {
       
    /**
     * Width of the window in Event Application
     */
    public static final int WIDTH = 900;
    
    /**
     * Height of the window in Event Application
     */
    public static final int HEIGHT = 700;
    
    /**
     * Moment in seconds when the first TEXT appears 
     * in milliseconds.
     * 
     * Ex. 2000 = 2 seconds
     */
    public static final long INTRO_APPEARANCE = 700;
    
    /**
     * Height of the left side bar
     * @see blue.mdc.event.Side
     */
    public static final double SIDE_HEIGHT = 700.0;
    
    /**
     * Width of the left side bar
     * @see blue.mdc.event.Side
     */
    public static final double SIDE_WIDTH = 304.0;
    
    /**
     * Initial Value of the button in the Side Bar
     * 
     * @see blue.mdc.event.Side
     */
    public static final double SIDE_BUTTON_Y = 110.0;
    
    
    /**
     * Distance between each button in the Side Bar.
     * 
     * @see blue.mdc.event.Side
     */
    public static final double DISTANCE_BTW_BUTTONS = 50.0;
    
    /**
     * Layout X of the labels in the {@link AddTraveler} class
     */
    public static final double LABELS_LAYOUT_X = 56.0;

    /**
     * Initial Value of the labels in {@link AddTraveler}
     * 
     * @see blue.mdc.event.AddTraveler
     */
    public static final double LABELS_LAYOUT_Y = 159.0;
    
    /**
     * Distance between each label in the {@link AddTraveler}
     * 
     * @see blue.mdc.event.AddTraveler
     */
    public static final double DISTANCE_BTW_LABELS = 56.0;
    
    /**
     * Layout X of the TextFields in {@link AddTraveler}
     * 
     * @see blue.mdc.event.AddTraveler
     */
    public static final double TEXT_FIELD_LAYOUT_X = 160.0;
    
    /**
     * Initial Value of Layout Y of the
     * TextFields in {@link AddTraveler}
     * 
     * @see blue.mdc.event.AddTraveler
     */
    public static final double TEXT_FIELD_INITIAL_LAYOUT_Y = 138.0;
    
    /**
     * Distance between each Text Field in
     * the {@link AddTraveler} class.
     * 
     * @see blue.mdc.event.AddTraveler
     */
    public static final double DISTANCE_BTW_TEXT_FIELDS = 56.0;
}