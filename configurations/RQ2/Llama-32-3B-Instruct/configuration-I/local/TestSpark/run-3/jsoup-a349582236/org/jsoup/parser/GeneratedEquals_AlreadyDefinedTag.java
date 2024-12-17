package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEquals_AlreadyDefinedTag {

    @Test
    public void equals_AlreadyDefinedTag() {
        Tag tag1 = new Tag();
        tag1.setName("test");
        Tag tag2 = new Tag();
        tag2.setName("test");
        assertEquals(tag1, tag2);
    }

}