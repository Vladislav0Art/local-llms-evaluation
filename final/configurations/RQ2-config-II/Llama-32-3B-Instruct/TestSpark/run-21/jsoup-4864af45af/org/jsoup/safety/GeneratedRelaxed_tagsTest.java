package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRelaxed_tagsTest {

    @Test
    public void relaxed_tagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("script"));
    }

}