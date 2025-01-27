package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_SelfClosingTagsPreserveWhitespace_ReturnsTrue {

    @Test
    public void preserveWhitespace_SelfClosingTagsPreserveWhitespace_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        assertTrue(tag.preserveWhitespace());
    }

}