package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAttributesHtmlTest {

    @Test
    public void attributesHtmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertEquals(" key=\"value\"", attributes.html());
    }

}