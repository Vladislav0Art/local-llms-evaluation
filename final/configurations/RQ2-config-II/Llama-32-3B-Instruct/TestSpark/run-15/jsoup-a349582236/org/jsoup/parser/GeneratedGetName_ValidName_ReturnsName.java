package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_ValidName_ReturnsName {

    @Test
    public void getName_ValidName_ReturnsName() {
        String name = "div";
        Tag tag = new Tag(name);
        assertEquals(name, tag.getName());
    }

}