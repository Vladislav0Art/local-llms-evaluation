package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        Attributes incoming = new Attributes();
        incoming.add("key", "value");
        attributes.addAll(incoming);
        assertTrue(attributes.hasKey("key"));
    }

}