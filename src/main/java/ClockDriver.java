package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33-
        //  * Tick test for 03:09 to 03:10-
        //  * Tick test for 01:59 to 02:00-
        //  * Tick test for 09:59 to 10:00-
        //  * Tick test for 23:59 to 00:00-
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("Empty C0n Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(3, 45);
        
        String test2Output = test2.getTime();
        System.out.println("2 Arg Con Test - " + test2Output);
        
        ClockDisplay tickTest1 = new ClockDisplay(3, 32);
        System.out.println("Tick test one pre tick " + tickTest1.getTime());
        tickTest1.timeTick();
        System.out.println("Tick test one ticked" + tickTest1.getTime());
        ClockDisplay tickTest2 = new ClockDisplay(3, 9);
        System.out.println("Tick test one pre tick " + tickTest2.getTime());
        tickTest2.timeTick();
        System.out.println("Tick test one ticked" + tickTest2.getTime());
        ClockDisplay tickTest3 = new ClockDisplay(1, 59);
        System.out.println("Tick test one pre tick " + tickTest3.getTime());
        tickTest3.timeTick();
        System.out.println("Tick test one ticked" + tickTest3.getTime());
        ClockDisplay tickTest4 = new ClockDisplay(9, 59);
        System.out.println("Tick test one pre tick " + tickTest4.getTime());
        tickTest4.timeTick();
        System.out.println("Tick test one ticked" + tickTest4.getTime());
        ClockDisplay tickTest5 = new ClockDisplay(23, 59);
        System.out.println("Tick test one pre tick " + tickTest5.getTime());
        tickTest5.timeTick();
        System.out.println("Tick test one ticked" + tickTest5.getTime());
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds test1b = new ClockDisplaySeconds();
        String test1bOutput = test1b.getTimeSeconds();
        System.out.println("Empty Con Test - " + test1bOutput);
        ClockDisplaySeconds test2b = new ClockDisplaySeconds(3, 45, 59);
        String test2bOutput = test2b.getTimeSeconds();
        System.out.println("2 Arg Con Test - " + test2bOutput);
        
        ClockDisplaySeconds tickTestS1 = new ClockDisplaySeconds(3, 32, 59);
        System.out.println("Tick test one pre tick " + tickTestS1.getTimeSeconds());
        tickTestS1.timeTickSeconds();
        System.out.println("Tick test one ticked" + tickTestS1.getTimeSeconds());
        
        ClockDisplaySeconds tickTestS2 = new ClockDisplaySeconds(1, 00, 59);
        System.out.println("Tick test two pre tick " + tickTestS2.getTimeSeconds());
        tickTestS2.timeTickSeconds();
        System.out.println("Tick test two ticked" + tickTestS2.getTimeSeconds());
        
        ClockDisplaySeconds tickTestS3 = new ClockDisplaySeconds(1, 59, 59);
        System.out.println("Tick test two pre tick " + tickTestS3.getTimeSeconds());
        tickTestS3.timeTickSeconds();
        System.out.println("Tick test two ticked" + tickTestS3.getTimeSeconds());
        
        ClockDisplaySeconds tickTestS4 = new ClockDisplaySeconds(23, 59, 59);
        System.out.println("Tick test two pre tick " + tickTestS4.getTimeSeconds());
        tickTestS4.timeTickSeconds();
        System.out.println("Tick test two ticked" + tickTestS4.getTimeSeconds());
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        ClockDisplay12Hour test1c = new ClockDisplay12Hour();
        String test1cOutput = test1c.getTime12Hour();
        System.out.println("Empty Con Test - " + test1cOutput);
        
        ClockDisplay12Hour test2c = new ClockDisplay12Hour(3, 45, 59, "AM");
        String test2cOutput = test2c.getTime12Hour();
        System.out.println("2 Arg Con Test - " + test2cOutput);
        
        ClockDisplay12Hour tickTestH1 = new ClockDisplay12Hour(3, 32, 59, "PM");
        System.out.println("Tick test one pre tick " + tickTestH1.getTime12Hour());
        tickTestH1.timeTick12Hour();
        System.out.println("Tick test one ticked" + tickTestH1.getTime12Hour());
        
        ClockDisplay12Hour tickTestH2 = new ClockDisplay12Hour(11, 59, 59, "AM");
        System.out.println("Tick test one pre tick " + tickTestH2.getTime12Hour());
        tickTestH2.timeTick12Hour();
        System.out.println("Tick test one ticked" + tickTestH2.getTime12Hour());
        
        ClockDisplay12Hour tickTestH3 = new ClockDisplay12Hour(11, 59, 59, "PM");
        System.out.println("Tick test one pre tick " + tickTestH3.getTime12Hour());
        tickTestH3.timeTick12Hour();
        System.out.println("Tick test one ticked" + tickTestH3.getTime12Hour());
    }
}
