package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedRemoveExistingKeyTest {

    @Test
    public void removeExistingKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        attrs.remove("key");
        assertEquals(0, attrs.size());
    }

}