package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.HashMap;

public class GeneratedValueOfUnknownTag {

    @Test
    public void valueOfUnknownTag() {
        assertFalse(Tag.valueOf("unknown").isKnownTag());
    }

}