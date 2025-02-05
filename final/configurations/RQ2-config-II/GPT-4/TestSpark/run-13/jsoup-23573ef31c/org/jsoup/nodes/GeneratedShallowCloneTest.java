package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Document shallowClone = doc.shallowClone();
        assertEquals(doc.outerHtml(), shallowClone.outerHtml());
    }

}