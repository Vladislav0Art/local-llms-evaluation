package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_CloneOfEmptyTag_ReturnsFalseForDifferentTag {

    @Test
    public void equals_CloneOfEmptyTag_ReturnsFalseForDifferentTag() {
        Tag tag1 = new Tag("");
        Tag tag2 = new Tag("");
        assertFalse(tag1.equals(tag2));
    }

}