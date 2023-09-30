package fileHandlingDemo6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MobileEmailVerification {
    private Properties properties;

    public MobileEmailVerification(Properties properties) {
        this.properties = properties;
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

    public static void main(String[] args) {
        Properties properties = loadProperties("config.properties");
        MobileEmailVerification verification = new MobileEmailVerification(properties);
        verification.sendOTP();
        verification.verifyOTP();
    }

    private static Properties loadProperties(String filePath) {
        Properties loadedProperties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            loadedProperties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loadedProperties;
    }
}

