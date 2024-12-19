package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNormalName_AlwaysReturnsNormalName {

    @Test
    public void normalName_AlwaysReturnsNormalName() {
        Tag tag = new Tag();
        String name = "test";
        assertEquals(name.toLowerCase(), tag.normalName());
    }

}