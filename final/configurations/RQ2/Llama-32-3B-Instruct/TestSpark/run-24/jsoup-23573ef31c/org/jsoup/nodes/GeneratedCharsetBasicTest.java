package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedCharsetBasicTest {

    @Test
    public void charsetBasicTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        Charset actualCharset = document.charset();
        org.junit.Assert.assertEquals(charset, actualCharset);
    }

}