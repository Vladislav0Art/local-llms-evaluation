package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_SelfClosingTags_ReturnsFalse {

    @Test
    public void preserveWhitespace_SelfClosingTags_ReturnsFalse() {
        Tag tag = new Tag("img");
        assertFalse(tag.preserveWhitespace());
    }

}