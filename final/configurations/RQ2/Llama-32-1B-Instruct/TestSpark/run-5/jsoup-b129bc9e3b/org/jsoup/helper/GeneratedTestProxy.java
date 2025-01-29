package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class GeneratedTestProxy {

    public static void testGet() throws IOException {
        HttpConnection connection = new HttpConnection();
        when(connection.get()).thenReturn(new Document());
        Document document = connection.get();
        assertEquals("", document.toString());
    }

    @Test
    public void testProxy() {
        HttpConnection connection = mock(HttpConnection.class);
        when(connection.proxy(any())).thenReturn(new Connection(true, 10));
        try {
            connection.connect(url());
        } catch (Exception e) {
            throw new AssertionError(e.getMessage());
        }
        assert true;
    }

}