package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class GeneratedTestGetCookieManager {

    public static void testGet() throws IOException {
        HttpConnection connection = new HttpConnection();
        when(connection.get()).thenReturn(new Document());
        Document document = connection.get();
        assertEquals("", document.toString());
    }

    @Test
    public void testGetCookieManager() {
        Document document = Jsoup.connect("http://example.com").get();
        CookieManager cookieManager = (CookieManager) document.cookies().get(0).getScheme().equals("https") ? new DefaultCookieManager() : new HttpCookieManager();
        assert cookieManager != null;
    }

}