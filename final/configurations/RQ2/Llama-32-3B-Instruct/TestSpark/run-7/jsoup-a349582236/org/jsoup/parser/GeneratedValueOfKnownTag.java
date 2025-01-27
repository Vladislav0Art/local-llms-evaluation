package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedValueOfKnownTag {

    @Test
    public void valueOfKnownTag() {
        assertTrue(Tag.valueOf("div").isKnownTag());
    }

}