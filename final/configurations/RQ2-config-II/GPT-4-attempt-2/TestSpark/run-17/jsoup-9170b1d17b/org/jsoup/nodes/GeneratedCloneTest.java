package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Attributes cloneAttributes = attributes.clone();
        assertEquals(attributes, cloneAttributes);
    }

}