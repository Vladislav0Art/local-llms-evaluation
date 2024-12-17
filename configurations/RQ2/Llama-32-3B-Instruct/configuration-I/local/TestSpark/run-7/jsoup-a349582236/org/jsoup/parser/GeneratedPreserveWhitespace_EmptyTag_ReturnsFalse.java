package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedPreserveWhitespace_EmptyTag_ReturnsFalse {

    @Test
    public void preserveWhitespace_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

}