package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_SimpleTagName_ReturnsKnownTag {

    @Test
    public void valueOf_SimpleTagName_ReturnsKnownTag() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName, new ParseSettings());
        assertTrue(Tag.isKnownTag(tagName));
    }

}