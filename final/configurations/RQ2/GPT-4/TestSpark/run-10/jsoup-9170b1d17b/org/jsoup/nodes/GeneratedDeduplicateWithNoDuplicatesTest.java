package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedDeduplicateWithNoDuplicatesTest {

    @Test
    public void deduplicateWithNoDuplicatesTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1").add("key2", "value2");
        assertEquals(0, attrs.deduplicate(ParseSettings.preserveCase));
    }

}