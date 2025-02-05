package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("http://localhost");
        Element textElement = document.text("Test Text");
        assertEquals("Test Text", textElement.text());
    }

}