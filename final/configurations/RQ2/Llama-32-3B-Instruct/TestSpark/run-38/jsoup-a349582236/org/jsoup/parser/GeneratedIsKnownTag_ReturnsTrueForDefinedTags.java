package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_ReturnsTrueForDefinedTags {

    @Test
    public void isKnownTag_ReturnsTrueForDefinedTags() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertTrue(emptyTag.isKnownTag());
        assertTrue(Tag.valueOf("div").isKnownTag());
    }

}