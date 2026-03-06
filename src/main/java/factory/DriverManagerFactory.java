package factory;

import enums.DriverType;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
            case FIREFOX:
                //todo
            default:
                driverManager = new ChromeDriverManager();
                break;
        }

        return driverManager;
    }
}
