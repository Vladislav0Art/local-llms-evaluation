package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Document cloneDoc = doc.clone();
        assertEquals(doc.outerHtml(), cloneDoc.outerHtml());
    }

}