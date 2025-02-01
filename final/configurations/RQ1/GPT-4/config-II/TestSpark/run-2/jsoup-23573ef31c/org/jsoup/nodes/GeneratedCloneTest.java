package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    private final static Charset UTF_CHARSET = StandardCharsets.UTF_8;
    private final static String BASE_URI = "http://example.org";

    @Test
    public void cloneTest() {
        Document document = new Document(BASE_URI);
        Document clonedDocument = document.clone();
        assertNotSame(document, clonedDocument);
        assertEquals(document.location(), clonedDocument.location());
        assertEquals(document.charset(), clonedDocument.charset());
    }

}