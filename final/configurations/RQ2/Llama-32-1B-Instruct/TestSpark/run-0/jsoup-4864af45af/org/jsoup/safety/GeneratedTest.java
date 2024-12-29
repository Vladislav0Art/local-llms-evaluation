package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTest {

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "span");
        safelist.removeTags("span");
        safelist.addAttribute("class", "test-class");
        Assert.assertTrue(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basic() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        safelist.removeAttributes("style");
        safelist.addEnforcedAttribute("data-attr", "test-attr", "test-value");
        Assert.assertTrue(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.none();
        safelist.addTags("img");
        safelist.removeAttributes("style");
        safelist.addEnforcedAttribute("data-attr", "test-attr", "test-value");
        safelist.addProtocols("img", "image-types");
        Assert.assertTrue(safelist.isSafeTag("img"));
        Assert.assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p");
        safelist.removeAttributes("style");
        safelist.addEnforcedAttribute("data-attr", "test-attr", "test-value");
        Assert.assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeTag("p"));
        Assert.assertFalse(safelist.isSafeTag("img"));
    }

}