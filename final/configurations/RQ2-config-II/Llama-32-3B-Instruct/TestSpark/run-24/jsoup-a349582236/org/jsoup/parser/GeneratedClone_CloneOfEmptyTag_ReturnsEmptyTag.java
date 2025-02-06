package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_CloneOfEmptyTag_ReturnsEmptyTag {

    @Test
    public void clone_CloneOfEmptyTag_ReturnsEmptyTag() {
        Tag tag = new Tag("");
        Tag clonedTag = (Tag) tag.clone();
        assertEquals("", clonedTag.getName());
    }

}