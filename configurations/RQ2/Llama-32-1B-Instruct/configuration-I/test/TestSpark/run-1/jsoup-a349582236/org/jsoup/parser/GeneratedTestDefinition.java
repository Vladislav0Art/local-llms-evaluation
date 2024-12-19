package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestDefinition {

    @Test
    public void testDefinition() {
        assertEquals("<dfn>", Tag.valueOf("span", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<dfn>", Tag.valueOf("span", null).asString());
        assertEquals("<dfn>", Tag.valueOf(null, "div").asString());
    }

}