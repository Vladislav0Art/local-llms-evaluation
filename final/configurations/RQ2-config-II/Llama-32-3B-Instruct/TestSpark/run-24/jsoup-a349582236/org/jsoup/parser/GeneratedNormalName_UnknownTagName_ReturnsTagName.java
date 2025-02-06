package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_UnknownTagName_ReturnsTagName {

    @Test
    public void normalName_UnknownTagName_ReturnsTagName() {
        String tagName = "unknown";
        Tag tag = new Tag(tagName);
        assertTrue(tag.normalName().equals(tagName));
    }

}