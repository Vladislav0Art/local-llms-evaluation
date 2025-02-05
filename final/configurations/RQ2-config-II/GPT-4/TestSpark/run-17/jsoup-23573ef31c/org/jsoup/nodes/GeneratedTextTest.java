package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        String testText = "Test Text";
        Document doc = new Document("http://example.com");
        doc.text(testText);
        assertEquals(testText, doc.text());
    }

}