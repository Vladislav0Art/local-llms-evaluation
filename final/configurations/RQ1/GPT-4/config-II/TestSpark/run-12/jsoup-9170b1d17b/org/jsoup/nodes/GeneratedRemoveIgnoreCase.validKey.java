package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedRemoveIgnoreCase.

validKey {

    private static final String TEST_KEY = "testKey";
    private static final String TEST_VALUE = "testValue";

    private Attributes attributes;

    @Test
    public void removeIgnoreCase.validKey() {
        attributes = new Attributes();
        attributes.add(TEST_KEY, TEST_VALUE);
        attributes.removeIgnoreCase(TEST_KEY);

        int size = attributes.size();
        assertEquals(0, size);
    }

}