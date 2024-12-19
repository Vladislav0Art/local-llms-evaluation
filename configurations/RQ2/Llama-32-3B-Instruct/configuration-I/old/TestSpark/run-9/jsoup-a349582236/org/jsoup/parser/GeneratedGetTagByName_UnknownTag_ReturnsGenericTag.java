package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetTagByName_UnknownTag_ReturnsGenericTag {

    @Test
    public void getTagByName_UnknownTag_ReturnsGenericTag() {
        String tagName = "xyz";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertTrue(!tag.equals(null));
    }

}