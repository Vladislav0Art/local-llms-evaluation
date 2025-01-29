package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValueInline {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testGetValueInline() {
        expectedValue.put("name", false);
        expectedValue.put("isInline", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isInline"), value.isInline());
    }

}