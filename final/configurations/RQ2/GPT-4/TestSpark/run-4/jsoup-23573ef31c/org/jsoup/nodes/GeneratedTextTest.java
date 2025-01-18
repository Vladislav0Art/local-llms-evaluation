package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("http://test.url");
        document.text("Test Text");
        assertEquals("Test Text", document.text());
    }

}