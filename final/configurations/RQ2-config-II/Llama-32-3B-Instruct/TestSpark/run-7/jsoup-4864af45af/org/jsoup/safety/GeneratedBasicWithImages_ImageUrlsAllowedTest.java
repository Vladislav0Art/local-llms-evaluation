package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedBasicWithImages_ImageUrlsAllowedTest {

    @Test
    public void basicWithImages_ImageUrlsAllowedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.add("img");
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

}