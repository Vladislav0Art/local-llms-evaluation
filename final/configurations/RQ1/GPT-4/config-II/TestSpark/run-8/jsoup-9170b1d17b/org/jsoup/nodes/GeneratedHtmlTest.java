package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        String html = attributes.html();
        assertTrue(html.contains("key1=\"value1\""));
        assertTrue(html.contains("key2=\"value2\""));
    }

}