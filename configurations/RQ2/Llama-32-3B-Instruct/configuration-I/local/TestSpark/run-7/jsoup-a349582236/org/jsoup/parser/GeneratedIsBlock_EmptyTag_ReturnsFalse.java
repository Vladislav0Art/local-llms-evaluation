package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlock_EmptyTag_ReturnsFalse {

    @Test
    public void isBlock_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

}