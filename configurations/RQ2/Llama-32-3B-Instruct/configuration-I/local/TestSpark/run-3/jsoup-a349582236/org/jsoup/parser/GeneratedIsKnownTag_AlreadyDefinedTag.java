package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsKnownTag_AlreadyDefinedTag {

    @Test
    public void isKnownTag_AlreadyDefinedTag() {
        Tag tag1 = new Tag();
        tag1.setName("test");
        assertTrue(Tag.isKnownTag(tag1.getName()));
    }

}