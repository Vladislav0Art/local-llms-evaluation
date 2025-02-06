package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_KnownTagName_ReturnsNormalizedName {

    @Test
    public void normalName_KnownTagName_ReturnsNormalizedName() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        assertTrue(tag.normalName().equals("div"));
    }

}