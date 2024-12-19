package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveWhitespace_EmptyTag_ReturnsTrue {

    @Test
    public void preserveWhitespace_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.preserveWhitespace());
    }

}