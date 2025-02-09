package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDocumentConstructorTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("https://sample.com");
        assertEquals("https://sample.com", document.baseUri());
    }

}