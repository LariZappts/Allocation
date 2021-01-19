package cucumber.steps;

import javax.net.ssl.SSLSession;

public abstract class HostnameVerifier {

    public abstract boolean verify(String hostname, SSLSession session);
}
