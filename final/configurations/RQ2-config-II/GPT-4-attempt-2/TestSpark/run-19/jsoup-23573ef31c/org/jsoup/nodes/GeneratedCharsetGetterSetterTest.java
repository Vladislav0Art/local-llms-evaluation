package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCharsetGetterSetterTest {

    @Test
    public void charsetGetterSetterTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}