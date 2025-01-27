package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_SelfOpeningTag_ReturnsTrue {

    @Test
    public void isInline_SelfOpeningTag_ReturnsTrue() {
        String tagName = "span";
        assertTrue(Tag.isSelfOpening(tagName));
    }

}