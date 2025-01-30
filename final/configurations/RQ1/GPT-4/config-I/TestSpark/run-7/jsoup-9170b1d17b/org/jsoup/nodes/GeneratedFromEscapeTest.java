package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedFromEscapeTest {

    @Test
    public void fromEscapeTest() {
        String input = "\"\\\"key\\\":\\\"\\u0031\\u0032\\u0033\\\"\"";
        Attributes expected = new Attributes();
        expected.put("key", "\u0031\u0032\u0033");

        Attributes actual = Attributes.fromEscape(input);

        assertEquals(expected, actual);
    }

}