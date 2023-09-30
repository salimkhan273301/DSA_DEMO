package fileHandlingDemo2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * The properties are loaded directly in the constructor of the MobileEmailVerification class.

You don't need a separate PropertyReader class or Singleton pattern.

You can access the properties directly within the class methods.

This approach is simpler and avoids the need for an additional class to manage the properties.
 * 
 * 
 */

public class MobileEmailVerification {
    private Properties properties;

    public MobileEmailVerification() {
        properties = loadProperties();
    }

    private Properties loadProperties() {
        Properties loadedProperties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
            loadedProperties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedProperties;
    }

    public void sendOTP() {
        String sendOTPUrl = properties.getProperty("send_otp_url");
        int readTimeout = Integer.parseInt(properties.getProperty("read_timeout"));
        
        // Use sendOTPUrl and readTimeout in your sendOTP logic
        System.out.println("Sending OTP using URL: " + sendOTPUrl);
        System.out.println("Read Timeout: " + readTimeout + " milliseconds");
    }

    public void verifyOTP() {
        String verifyOTPUrl = properties.getProperty("verify_otp_url");
        
        // Use verifyOTPUrl in your verifyOTP logic
        System.out.println("Verifying OTP using URL: " + verifyOTPUrl);
    }
}
