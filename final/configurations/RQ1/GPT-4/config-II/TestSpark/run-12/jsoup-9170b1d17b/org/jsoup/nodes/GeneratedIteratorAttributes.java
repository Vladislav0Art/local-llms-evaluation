package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedIteratorAttributes {

    private static final String TEST_KEY = "testKey";
    private static final String TEST_VALUE = "testValue";

    private Attributes attributes;

    @Test
    public void iteratorAttributes() {
        attributes = new Attributes();
        attributes.add(TEST_KEY, TEST_VALUE);

        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
    }

}