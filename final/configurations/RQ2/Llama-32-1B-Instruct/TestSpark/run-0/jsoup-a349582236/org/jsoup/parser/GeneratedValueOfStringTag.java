package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedValueOfStringTag {

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
    public void valueOfStringTag() {
        String tagName = "div";
        Tag tag = ParseSettings.valueOf(tagName);
        assertTrue(tag != null, "Value of stringTag method returns null");
    }

}