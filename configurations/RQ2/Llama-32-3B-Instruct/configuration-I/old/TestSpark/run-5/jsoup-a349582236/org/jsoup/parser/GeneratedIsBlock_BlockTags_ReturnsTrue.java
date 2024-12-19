package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_BlockTags_ReturnsTrue {

    @Test
    public void isBlock_BlockTags_ReturnsTrue() {
        Tag tag = new Tag("P");
        assertTrue(tag.isBlock());
    }

}