package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPreserveWhitespace_EmptyTagName_ReturnsTrue {

    @Test
    public void preserveWhitespace_EmptyTagName_ReturnsTrue() {
        Tag tag = new Tag("");
        assertTrue(tag.preserveWhitespace());
    }

}