package org.jsoup.helper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import org.jsoup.nodes.Document;

public class GeneratedTestConnectWithCookieStore {

    private MockHttpConnection mockHttpConnection;

    public static void main(String[] args) {
        new HttpConnectionTest();
    }

    @Before
    public void setup() {
        mockHttpConnection = new MockHttpConnection();
    }

    @Test
    public void testConnectWithCookieStore() throws IOException, MalformedURLException {
        CookieManager cookieManager = new DefaultCookieManager();
        mockHttpConnection.connect(new URL("https://example.com"), cookieManager);
        verify(cookieManager).cookieStore(Mockito.any(CookieStore.class));
    }

}