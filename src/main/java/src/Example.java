package src;

public class Example {
    static String appId = "970CA35de60c44645bbae8a215061b33";
    static String appCertificate = "5CFd2fd1755d40ecb72977518be15d3b";
    static String channelName = "7d72365eb983485397e3e3f9d460bdda";
    static String uid = "2082341273";
    static int tokenExpirationInSeconds = 3600;
    static int privilegeExpirationInSeconds = 3600;

    public static void main(String[] args) {
        RtcTokenBuilder token = new RtcTokenBuilder();
        String result = token.buildTokenWithUid(appId, appCertificate, channelName, uid, RtcTokenBuilder.Role.ROLE_SUBSCRIBER, tokenExpirationInSeconds, privilegeExpirationInSeconds);
        System.out.println("Token with uid: " + result);
    }
}

