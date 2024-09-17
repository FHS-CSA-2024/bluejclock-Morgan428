package src.main.java;
public class ClockDisplay12Hour
{
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String mornings;
    private String display;
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplay12Hour(){
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        String mornings = ("AM");
        updateDisplay12Hour();
    }
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplay12Hour(int hour, int minute, int second, String morning){
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        String mornings = ("AM"); 
        setTime12Hour(hour, minute, second, morning);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick12Hour(){
        seconds.incerment();
        if (seconds.getValue() == 0){
            minutes.incerment();
        }
        if (minutes.getValue() == 0){
            hours.incerment();
        }
        if (hours.getValue() == 0){
            if (mornings == "AM"){
                mornings = "PM";
            }
            else {
                mornings = "AM";
                }
        }
        updateDisplay12Hour();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime12Hour(int hour, int minute, int second, String morning){
        minutes.setValue(minute);
        hours.setValue(hour);
        seconds.setValue(second);
        mornings = morning;
        updateDisplay12Hour();
    }    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime12Hour(){
     return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay12Hour(){
        String output;
        output = hours.getDisplayValue();
        output = output + ":";
        output = output + minutes.getValue();
        output = output + ":";
        output = output + seconds.getValue();
        output = output + " ";
        output = output + mornings;
        display = output;
        }
}
