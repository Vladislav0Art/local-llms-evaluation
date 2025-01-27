package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedDataSetsDataOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void dataSetsDataOnConnection() {
        String key = "value";
        Connection connection = HttpConnection.data(key);
        assert connection.getData().containsKey(key);
    }

}