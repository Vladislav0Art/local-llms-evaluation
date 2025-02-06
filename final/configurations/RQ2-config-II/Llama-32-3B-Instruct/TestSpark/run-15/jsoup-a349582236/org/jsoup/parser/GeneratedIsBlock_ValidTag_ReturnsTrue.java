package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_ValidTag_ReturnsTrue {

    @Test
    public void isBlock_ValidTag_ReturnsTrue() {
        String name = "p";
        Tag tag = new Tag(name);
        assertTrue(tag.isBlock());
    }

}