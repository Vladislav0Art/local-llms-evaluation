package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTestConnectWithProxy {

    private HttpConnection httpConnection = new HttpConnection();

    @Test
    public void testConnectWithProxy() throws IOException, URISyntaxException, InterruptedException {
        URL url = new URL("https://example.com");
        String proxyHost = "proxy.example.com";
        int proxyPort = 8080;
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
        httpConnection.setProxy(proxy);

        HttpURLConnection connection = (HttpURLConnection) httpConnection.connect(url, null);
        assertEquals(200, connection.getResponseCode());
    }

}