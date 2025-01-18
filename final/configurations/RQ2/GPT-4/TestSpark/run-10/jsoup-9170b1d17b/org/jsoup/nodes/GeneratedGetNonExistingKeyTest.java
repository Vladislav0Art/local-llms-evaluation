package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedGetNonExistingKeyTest {

    @Test
    public void getNonExistingKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        assertNull(attrs.get("non-existent"));
    }

}