package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedHasDeclaredValueForKeyIgnoreCaseTest {

    @Test
    public void hasDeclaredValueForKeyIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("KeY", "value");
        assertTrue(attrs.hasDeclaredValueForKeyIgnoreCase("key"));
        assertFalse(attrs.hasDeclaredValueForKeyIgnoreCase("missing"));
    }

}