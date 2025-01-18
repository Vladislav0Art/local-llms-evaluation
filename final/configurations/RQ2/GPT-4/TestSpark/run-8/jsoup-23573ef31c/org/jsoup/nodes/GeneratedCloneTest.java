package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document doc = new Document("https://example.com");
        Document clone = doc.clone();
        assertEquals(doc.outerHtml(), clone.outerHtml());
    }

}