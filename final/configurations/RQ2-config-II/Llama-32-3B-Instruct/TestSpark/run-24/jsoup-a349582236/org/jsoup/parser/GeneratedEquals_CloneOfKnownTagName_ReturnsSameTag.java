package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_CloneOfKnownTagName_ReturnsSameTag {

    @Test
    public void equals_CloneOfKnownTagName_ReturnsSameTag() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag1 = Tag.valueOf(tagName, settings);
        Tag tag2 = (Tag) tag1.clone();
        assertTrue(tag1.equals(tag2));
    }

}