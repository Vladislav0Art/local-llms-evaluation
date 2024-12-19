package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveWhitespace_AlwaysReturnsFalse {

    @Test
    public void preserveWhitespace_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

}