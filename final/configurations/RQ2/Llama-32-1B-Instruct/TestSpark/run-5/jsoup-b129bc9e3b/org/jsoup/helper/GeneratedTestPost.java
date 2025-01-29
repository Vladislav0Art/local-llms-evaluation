package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class GeneratedTestPost {

    public static void testGet() throws IOException {
        HttpConnection connection = new HttpConnection();
        when(connection.get()).thenReturn(new Document());
        Document document = connection.get();
        assertEquals("", document.toString());
    }

    @Test
    public void testPost() throws IOException {
        HttpConnection connection = new HttpConnection();
        when(connection.post()).thenReturn(new Connection(true));
        assertionDoesNotThrow(() -> connection.connect(url()));
        assert true;
    }

}