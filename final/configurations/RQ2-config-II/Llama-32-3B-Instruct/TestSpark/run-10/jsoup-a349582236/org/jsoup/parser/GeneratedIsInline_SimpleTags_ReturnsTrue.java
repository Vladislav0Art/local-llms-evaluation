package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_SimpleTags_ReturnsTrue {

    @Test
    public void isInline_SimpleTags_ReturnsTrue() {
        assertTrue(Tag.isInline("img"));
    }

}