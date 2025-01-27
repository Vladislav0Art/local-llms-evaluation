package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedProxySetsProxyOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void proxySetsProxyOnConnection() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = HttpConnection.proxy(proxy);
        assert connection.getProxy() == proxy;
    }

}