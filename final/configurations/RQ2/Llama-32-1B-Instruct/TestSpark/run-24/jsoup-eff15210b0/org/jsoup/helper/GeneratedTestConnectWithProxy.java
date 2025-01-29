package org.jsoup.helper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import org.jsoup.nodes.Document;

public class GeneratedTestConnectWithProxy {

    private MockHttpConnection mockHttpConnection;

    public static void main(String[] args) {
        new HttpConnectionTest();
    }

    @Before
    public void setup() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnectWithProxy() throws IOException, MalformedURLException {
        String url = "https://example.com";
        mockHttpConnection.connect(url);
        verify(mockHttpConnection).connect(url);
        Mockito.verify(mockHttpConnection).proxy(Mockito.any(Proxy.class));
    }

}