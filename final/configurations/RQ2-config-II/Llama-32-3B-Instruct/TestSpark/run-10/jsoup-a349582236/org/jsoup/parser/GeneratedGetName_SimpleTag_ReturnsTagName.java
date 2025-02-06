package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_SimpleTag_ReturnsTagName {

    @Test
    public void getName_SimpleTag_ReturnsTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

}