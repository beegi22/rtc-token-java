package src;

public class Example {
    static String appId = "vLFiFqMbXXk1GCqJVtySqn";
    static String appCertificate = "iPx2XJyQZtSiciXEWEnNFC";
    static String channelName = "";
    static String uid = "";
    static int tokenExpirationInSeconds = 3600;
    static int privilegeExpirationInSeconds = 3600;

    public static void main(String[] args) {
        RtcTokenBuilder token = new RtcTokenBuilder();
        String result = token.buildTokenWithUid(appId, appCertificate, channelName, uid, RtcTokenBuilder.Role.ROLE_SUBSCRIBER, tokenExpirationInSeconds, privilegeExpirationInSeconds);
        System.out.println("Token with uid: " + result);
    }
}

