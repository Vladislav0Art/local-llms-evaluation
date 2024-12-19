package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedValueOf_AlreadyDefinedTag {

    @Test
    public void valueOf_AlreadyDefinedTag() {
        Tag tag1 = new Tag();
        tag1.setName("test");
        Tag result = Tag.valueOf(tag1.getName(), null);
        assertNotNull(result);
        assertEquals(tag1, result);
    }

}