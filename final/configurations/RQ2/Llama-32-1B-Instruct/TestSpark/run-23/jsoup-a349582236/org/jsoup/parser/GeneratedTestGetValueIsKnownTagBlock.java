package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValueIsKnownTagBlock {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testGetValueIsKnownTagBlock() {
        expectedValue.put("name", false);
        expectedValue.put("isKnownTag", true);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        assertEquals(expectedValue.get("name"), value.getName().equals(tagName));
        assertEquals(expectedValue.get("isKnownTag"), value.isKnownTag());
    }

}