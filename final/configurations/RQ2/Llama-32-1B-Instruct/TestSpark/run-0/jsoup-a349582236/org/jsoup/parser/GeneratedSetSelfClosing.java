package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedSetSelfClosing {

    private String name;
    private ParseSettings settings;
    private Map<String, Object> attributes = new HashMap<>();

    @BeforeEach
    public void setup() {
        this.name = "div";
        this.settings = new ParseSettings();
        this.attributes.put("class", "");
        this.attributes.put("id", "");
    }

    @Test
    public void setSelfClosing() {
        Tag tag = new Tag("div", new ParseSettings());
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing(), "setSelfClosing method does not return the correct value");
    }

    @BeforeClass
    public static void setupParseSettings() {
        ParseSettings settings = new ParseSettings();
        settings.setUnknownTag("unknownTagName");
        return settings;
    }

}