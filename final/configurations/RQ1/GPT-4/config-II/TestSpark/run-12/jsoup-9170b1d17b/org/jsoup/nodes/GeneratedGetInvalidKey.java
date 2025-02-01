package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import javax.annotation.Nullable;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedGetInvalidKey {

    private static final String TEST_KEY = "testKey";
    private static final String TEST_VALUE = "testValue";

    private Attributes attributes;

    @Test
    public void getInvalidKey() {
        attributes = new Attributes();
        attributes.get(null);
    }

}