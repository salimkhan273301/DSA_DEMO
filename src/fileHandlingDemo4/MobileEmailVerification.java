package fileHandlingDemo4;

public class MobileEmailVerification {
    private PropertyLoader propertyLoader;

    public MobileEmailVerification(PropertyLoader propertyLoader) {
        this.propertyLoader = propertyLoader;
    }

    public void sendOTP() {
        String sendOTPUrl = propertyLoader.getProperty("send_otp_url");
        int readTimeout = propertyLoader.getIntProperty("read_timeout");

        // Use sendOTPUrl and readTimeout in your sendOTP logic
        System.out.println("Sending OTP using URL: " + sendOTPUrl);
        System.out.println("Read Timeout: " + readTimeout + " milliseconds");
    }

    public void verifyOTP() {
        String verifyOTPUrl = propertyLoader.getProperty("verify_otp_url");

        // Use verifyOTPUrl in your verifyOTP logic
        System.out.println("Verifying OTP using URL: " + verifyOTPUrl);
    }

    public static void main(String[] args) {
        PropertyLoader loader = new PropertyLoader("config.properties");
        MobileEmailVerification verification = new MobileEmailVerification(loader);
        verification.sendOTP();
        verification.verifyOTP();
    }
}

