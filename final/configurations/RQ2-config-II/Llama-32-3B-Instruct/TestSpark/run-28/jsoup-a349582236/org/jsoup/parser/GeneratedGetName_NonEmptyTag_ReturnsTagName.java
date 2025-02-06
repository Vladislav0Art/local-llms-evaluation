package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_NonEmptyTag_ReturnsTagName {

    @Test
    public void getName_NonEmptyTag_ReturnsTagName() {
        Tag tag = new Tag();
        tag.setName("tag");
        assertEquals("tag", tag.getName());
    }

}