package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetName_AlwaysReturnsName {

    @Test
    public void getName_AlwaysReturnsName() {
        Tag tag = new Tag();
        String name = "test";
        assertEquals(name, tag.getName());
    }

}