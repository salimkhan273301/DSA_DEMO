package fileHandlingDemo3;

import java.util.ResourceBundle;

public class MobileEmailVerification {
    private ResourceBundle resourceBundle;

    public MobileEmailVerification() {
        resourceBundle = ResourceBundle.getBundle("config");
    }

    public void sendOTP() {
        String sendOTPUrl = resourceBundle.getString("send_otp_url");
        int readTimeout = Integer.parseInt(resourceBundle.getString("read_timeout"));
        
        // Use sendOTPUrl and readTimeout in your sendOTP logic
        System.out.println("Sending OTP using URL: " + sendOTPUrl);
        System.out.println("Read Timeout: " + readTimeout + " milliseconds");
    }

    public void verifyOTP() {
        String verifyOTPUrl = resourceBundle.getString("verify_otp_url");
        
        // Use verifyOTPUrl in your verifyOTP logic
        System.out.println("Verifying OTP using URL: " + verifyOTPUrl);
    }

    public static void main(String[] args) {
        MobileEmailVerification verification = new MobileEmailVerification();
        verification.sendOTP();
        verification.verifyOTP();
    }
}
