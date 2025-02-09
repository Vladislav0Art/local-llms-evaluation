package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String html = attributes.html();
        assertTrue(html.contains("key=\"value\""));
    }

}