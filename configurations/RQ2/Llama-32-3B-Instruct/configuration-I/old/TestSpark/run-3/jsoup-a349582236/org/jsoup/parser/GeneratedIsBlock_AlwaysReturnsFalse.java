package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlock_AlwaysReturnsFalse {

    @Test
    public void isBlock_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

}