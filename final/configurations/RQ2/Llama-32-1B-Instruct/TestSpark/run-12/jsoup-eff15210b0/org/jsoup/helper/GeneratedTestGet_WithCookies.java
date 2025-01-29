package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGet_WithCookies {

    private Document doc;

    @Before
    public void setup() {
        String url = "https://example.com";
        try {
            doc = Jsoup.connect(url).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGet_WithCookies() throws Exception {
        CookieManager cookieManager = new CookieManager();
        Document requestDoc = Jsoup.connect(new URL("https://example.com?param1=value1&param2=value2", cookieManager).get());
        assertEquals("Hello World!", requestDoc.html());
    }

}