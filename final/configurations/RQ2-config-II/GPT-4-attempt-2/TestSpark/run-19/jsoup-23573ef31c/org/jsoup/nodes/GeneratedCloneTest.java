package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();
        assertEquals(clone.outerHtml(), document.outerHtml());
    }

}