package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Tag;

public class GeneratedIsKnownTagStaticTest {

    @Test
    public void isKnownTagStaticTest() {
        assertFalse(Tag.isKnownTag("div"));
    }

}