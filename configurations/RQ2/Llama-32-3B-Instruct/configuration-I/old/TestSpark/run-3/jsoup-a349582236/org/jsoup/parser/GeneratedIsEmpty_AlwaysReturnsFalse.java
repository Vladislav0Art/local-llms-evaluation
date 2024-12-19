package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsEmpty_AlwaysReturnsFalse {

    @Test
    public void isEmpty_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

}