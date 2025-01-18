package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;
import org.jsoup.parser.Tag;

import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        Element element = new Element(Tag.valueOf("p"), "http://www.test.com");
        assertNotNull(element);
    }

}