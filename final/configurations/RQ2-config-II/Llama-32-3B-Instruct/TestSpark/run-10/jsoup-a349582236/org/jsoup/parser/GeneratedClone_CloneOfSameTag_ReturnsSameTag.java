package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_CloneOfSameTag_ReturnsSameTag {

    @Test
    public void clone_CloneOfSameTag_ReturnsSameTag() {
        Tag tag1 = new Tag("div");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}