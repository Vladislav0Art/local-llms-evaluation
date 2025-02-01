package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTrue {

    private static final String TEST_KEY = "testKey";
    private static final String TEST_VALUE = "testValue";

    private Attributes attributes;

    @Test
    public void isEmptyTrue() {
        attributes = new Attributes();

        boolean isEmpty = attributes.isEmpty();
        assertTrue(isEmpty);
    }

}