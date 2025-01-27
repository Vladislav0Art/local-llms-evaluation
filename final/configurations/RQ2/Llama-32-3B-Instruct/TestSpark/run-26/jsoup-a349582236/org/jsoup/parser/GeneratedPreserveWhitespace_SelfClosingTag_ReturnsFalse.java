package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_SelfClosingTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_SelfClosingTag_ReturnsFalse() {
        Tag tag = new Tag("img"); // self closing
        assertFalse(tag.preserveWhitespace());
    }

}