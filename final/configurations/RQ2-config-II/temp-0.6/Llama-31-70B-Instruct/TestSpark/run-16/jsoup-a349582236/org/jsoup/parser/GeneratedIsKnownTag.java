package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTag {

    @Test
    public void isKnownTag() {
        Tag tag = new Tag("test");
        assertFalse(tag.isKnownTag());
    }

}