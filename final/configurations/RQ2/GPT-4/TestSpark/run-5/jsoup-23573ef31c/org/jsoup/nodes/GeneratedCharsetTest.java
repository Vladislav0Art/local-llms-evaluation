package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("ISO-8859-1");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

}