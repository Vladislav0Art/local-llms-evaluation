package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_NoStyle_ReturnsFalse {

    @Test
    public void isBlock_NoStyle_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

}