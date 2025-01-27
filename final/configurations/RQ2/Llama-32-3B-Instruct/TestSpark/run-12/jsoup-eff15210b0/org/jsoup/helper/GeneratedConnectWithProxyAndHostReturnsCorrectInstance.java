package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedConnectWithProxyAndHostReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectWithProxyAndHostReturnsCorrectInstance() {
        String host = "localhost";
        int port = 8080;
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        Connection connection = HttpConnection.connect(proxy);
        assert connection != null;
    }

}