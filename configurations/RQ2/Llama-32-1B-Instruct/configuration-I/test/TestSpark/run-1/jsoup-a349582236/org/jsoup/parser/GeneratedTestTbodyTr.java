package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestTbodyTr {

    @Test
    public void testTbodyTr() {
        assertEquals("<tbody><tr>", Tag.valueOf("ul", null).asString());
        assertEquals("", Tag.parse("").value);
        assertEquals("<tbody><tr>", Tag.valueOf("ul", null).asString());
        assertEquals("<tbody><tr>", Tag.valueOf(null, "div").asString());
    }

}