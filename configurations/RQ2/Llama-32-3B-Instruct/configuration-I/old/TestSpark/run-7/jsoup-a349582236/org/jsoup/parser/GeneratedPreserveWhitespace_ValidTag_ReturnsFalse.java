package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPreserveWhitespace_ValidTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_ValidTag_ReturnsFalse() {
        Tag tag = new Tag("span");
        assertFalse(tag.preserveWhitespace());
    }

}