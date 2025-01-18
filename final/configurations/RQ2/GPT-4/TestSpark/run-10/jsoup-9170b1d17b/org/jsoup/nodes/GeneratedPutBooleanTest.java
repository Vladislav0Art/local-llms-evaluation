package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedPutBooleanTest {

    @Test
    public void putBooleanTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", true);
        assertEquals("", attrs.get("key"));
    }

}