package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

public class GeneratedBasicWithImages_SimpleTextTest {

    @Test
    public void basicWithImages_SimpleTextTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        assertTrue(basicWithImages.isSafeTag("img"));
        assertTrue(basicWithImages.isSafeTag("p"));
    }

}