package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedUserAgentSetsUserAgentOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void userAgentSetsUserAgentOnConnection() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assert connection.getUserAgent() == userAgent;
    }

}