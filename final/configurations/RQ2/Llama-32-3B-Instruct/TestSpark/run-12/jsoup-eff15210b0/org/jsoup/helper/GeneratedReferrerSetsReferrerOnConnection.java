package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedReferrerSetsReferrerOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void referrerSetsReferrerOnConnection() {
        String referrer = "https://example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assert connection.getReferer() == referrer;
    }

}