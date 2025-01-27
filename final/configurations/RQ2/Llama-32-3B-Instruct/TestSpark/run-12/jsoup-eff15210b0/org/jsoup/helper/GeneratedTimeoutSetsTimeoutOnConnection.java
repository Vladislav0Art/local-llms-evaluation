package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTimeoutSetsTimeoutOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void timeoutSetsTimeoutOnConnection() {
        int millis = 1000;
        Connection connection = HttpConnection.timeout(millis);
        assert connection.getTimeout() == millis;
    }

}