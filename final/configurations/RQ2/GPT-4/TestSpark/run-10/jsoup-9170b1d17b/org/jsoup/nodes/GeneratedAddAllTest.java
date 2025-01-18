package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        Attributes attrs2 = new Attributes();
        attrs1.add("key1", "value1");
        attrs2.add("key2", "value2").add("key3", "value3");
        attrs1.addAll(attrs2);
        assertEquals(3, attrs1.size());
    }

}