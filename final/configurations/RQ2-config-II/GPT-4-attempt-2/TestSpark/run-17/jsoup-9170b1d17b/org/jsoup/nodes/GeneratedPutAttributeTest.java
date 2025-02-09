package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        Attributes result = attributes.put(attribute);
        assertTrue(result.hasKey("key"));
    }

}