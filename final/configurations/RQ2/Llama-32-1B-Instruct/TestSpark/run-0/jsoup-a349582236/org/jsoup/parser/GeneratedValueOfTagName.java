package org.jsoup.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedValueOfTagName {

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
    public void valueOfTagName() {
        Tag tag1 = ParseSettings.valueOf("tagName");
        Tag tag2 = ParseSettings.valueOf("anotherTagname");
        assertTrue(tag1.equals(tag2), "Value of tagName method is not correct");
    }

}