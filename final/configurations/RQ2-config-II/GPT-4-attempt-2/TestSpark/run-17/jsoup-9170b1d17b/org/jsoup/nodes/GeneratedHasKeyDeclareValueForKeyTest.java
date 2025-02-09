package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedHasKeyDeclareValueForKeyTest {

    @Test
    public void hasKeyDeclareValueForKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertTrue(attributes.hasDeclaredValueForKey("key"));
    }

}