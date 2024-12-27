package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedWholeText_WholeText {

    @Test
    public void wholeText_WholeText() {
        Element element = new Element();
        element.append("before");
        element.append("after");
        assertEquals("beforeafter", element.wholeText());
    }

}