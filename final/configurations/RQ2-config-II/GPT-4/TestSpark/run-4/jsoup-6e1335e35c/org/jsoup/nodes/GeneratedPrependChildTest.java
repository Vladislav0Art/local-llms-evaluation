package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        Element child = new Element(Tag.valueOf("p"), "http://test.com");
        element.prependChild(child);
        assertNotNull(child.parent());
        assertEquals(element, child.parent());
        assertEquals(child, element.child(0));
    }

}