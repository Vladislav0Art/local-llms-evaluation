package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.shallowClone();
        assertEquals(document.outerHtml(), clone.outerHtml());
    }

}