package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedBasicWithImages_tagsTest {

    @Test
    public void basicWithImages_tagsTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("br"));
        assertTrue(safelist.isSafeTag("img"));
    }

}