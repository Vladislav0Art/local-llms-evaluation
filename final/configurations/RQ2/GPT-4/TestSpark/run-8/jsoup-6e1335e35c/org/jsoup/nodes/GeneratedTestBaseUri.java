package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedTestBaseUri {

    @Test
    public void testBaseUri() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        assertEquals("http://www.test.com", element.baseUri());
    }

}