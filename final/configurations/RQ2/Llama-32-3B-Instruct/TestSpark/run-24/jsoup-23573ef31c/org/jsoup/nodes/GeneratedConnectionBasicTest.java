package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedConnectionBasicTest {

    @Test
    public void connectionBasicTest() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = connection.get();
        org.junit.Assert.assertNotNull(document);
        org.junit.Assert.assertTrue(connection.eq(document.connection()));
    }

}