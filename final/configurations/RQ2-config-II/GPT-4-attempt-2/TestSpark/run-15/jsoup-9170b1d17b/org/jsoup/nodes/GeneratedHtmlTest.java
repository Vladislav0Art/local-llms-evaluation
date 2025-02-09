package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String html = "key=\"value\"";
        assertEquals(html, attributes.html());
    }

}