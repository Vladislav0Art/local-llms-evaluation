package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTagFalseTest {

    @Test
    public void isKnownTagFalseTest() {
        Tag tag = Tag.valueOf("xyz");
        assertFalse(tag.isKnownTag());
    }

}