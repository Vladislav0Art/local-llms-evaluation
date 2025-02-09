package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedClone_CloneTag_ReturnsNewTagObject {

    @Test
    public void clone_CloneTag_ReturnsNewTagObject() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Tag clonedTag = (Tag) tag.clone();
        assertNotNull(clonedTag);
        assertEquals(tagName, clonedTag.getName());
    }

}