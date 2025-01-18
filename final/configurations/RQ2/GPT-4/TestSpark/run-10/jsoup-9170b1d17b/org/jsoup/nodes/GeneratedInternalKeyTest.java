package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedInternalKeyTest {

    @Test
    public void internalKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("data-custom", "value");
        assertEquals("data-custom", Attributes.internalKey("custom"));
    }

}