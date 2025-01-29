package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValueSetSelfClosing {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testGetValueSetSelfClosing() {
        expectedValue.put("name", false);
        Tag value = Tag.valueOf(tagName, Parser.parseSettings());
        value.setSelfClosing(true);
        Mockito.verify(value).setSelfClosing();
    }

}