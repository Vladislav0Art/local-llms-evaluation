package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_ValidName_ReturnsTrue {

    @Test
    public void isKnownTag_ValidName_ReturnsTrue() {
        String name = "img";
        assertTrue(Tag.isKnownTag(name));
    }

}