package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeneratedIsKnownTag_SingleTagNamedReturnsTrue {

    @Test
    public void isKnownTag_SingleTagNamedReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.isKnownTag(tagName));
    }

}