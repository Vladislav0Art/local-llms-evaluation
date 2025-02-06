package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedBasic_safelyTagsTest {

    @Test
    public void basic_safelyTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("img"));
    }

}