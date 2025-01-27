package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedPostDataCharsetSetsPostDataCharsetOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void postDataCharsetSetsPostDataCharsetOnConnection() {
        String charset = "UTF-8";
        Connection connection = HttpConnection.postDataCharset(charset);
        assert connection.getPostDataCharset() == charset;
    }

}