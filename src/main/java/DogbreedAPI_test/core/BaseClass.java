package DogbreedAPI_test.core;

import DogbreedAPI_test.tools.SeleniumDriver;

public class BaseClass {

    public static SeleniumDriver SeleniumDriverInstance;

    private static String _reportDirectory;
    public static void setReportDirectory(String directory){_reportDirectory = directory;}
    public static String getReportDirectory(){return _reportDirectory;}

    public static String testName;

    public static boolean EnableScreenshots;
}
