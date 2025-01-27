package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedMaxBodySizeSetsMaxBodySizeOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void maxBodySizeSetsMaxBodySizeOnConnection() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assert connection.getMaxBodySize() == bytes;
    }

}