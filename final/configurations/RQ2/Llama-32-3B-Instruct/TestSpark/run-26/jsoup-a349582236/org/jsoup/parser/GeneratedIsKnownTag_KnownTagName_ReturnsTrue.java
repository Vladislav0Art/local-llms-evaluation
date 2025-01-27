package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_KnownTagName_ReturnsTrue {

    @Test
    public void isKnownTag_KnownTagName_ReturnsTrue() {
        Tag tag = new Tag("test");
        assertTrue(Tag.isKnownTag(tag.getName()));
    }

}