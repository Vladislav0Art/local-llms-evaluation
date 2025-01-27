package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_EmptyTagReturnsTrue {

    @Test
    public void isInline_EmptyTagReturnsTrue() {
        assertTrue(Tag.valueOf("").isInline());
    }

}