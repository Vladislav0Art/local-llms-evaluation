package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIgnoreContentTypeSetsIgnoreContentTypeOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void ignoreContentTypeSetsIgnoreContentTypeOnConnection() {
        boolean ignoreContentType = true;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assert connection.isIgnoreContentType() == ignoreContentType;
    }

}