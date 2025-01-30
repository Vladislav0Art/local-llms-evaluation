package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedToEscapeTest {

    @Test
    public void toEscapeTest() {
        String input = "\\u0031\\u0032\\u0033";
        Attributes attributes = new Attributes();
        attributes.put("key", "\u0031\u0032\u0033");

        String output = "\"\\\"key\\\":\\\"" + input + "\\\"\"";
        assertEquals(output, attributes.toEscape());
    }

}