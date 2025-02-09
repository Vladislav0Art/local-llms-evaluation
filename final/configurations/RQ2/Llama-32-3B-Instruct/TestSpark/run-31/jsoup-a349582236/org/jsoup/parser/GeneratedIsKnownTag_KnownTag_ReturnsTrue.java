package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_KnownTag_ReturnsTrue {

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        Tag tag = new Tag("a");
        assertTrue(Tag.isKnownTag(tag.getName()));
    }

}