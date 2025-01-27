package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedFollowRedirectsSetsFollowRedirectsOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void followRedirectsSetsFollowRedirectsOnConnection() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assert connection.isFollowRedirects() == followRedirects;
    }

}