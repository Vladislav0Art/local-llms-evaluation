package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;

public class GeneratedTestClassName {

    @Test
    public void testClassName() {
        Element element = new Element("<span class='test-class'>This is a span with the test-class class</span>");
        String className = element.className();
        assertTrue(className.contains("test-class"));
    }

}