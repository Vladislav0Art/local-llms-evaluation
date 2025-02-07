package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTest {

    private Safelist safelist;

    @Before
    public void setup() {
        safelist = new Safelist();
    }

    @Test
    public void noneTest() throws Exception {
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.getEnforcedAttributes("img").isEmpty());
    }

    @Test
    public void simpleTextTest() throws Exception {
        safelist.addTags("a", "b");
        safelist.addAttribute("href", "https://example.com");
        Safelist none = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeTag("b"));
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicTest() throws Exception {
        safelist.addTags("a", "b");
        safelist.addAttribute("href", "https://example.com");
        Safelist none = new Safelist();
        Assert.assertTrue(safelist.isSafeTag("a"));
        Assert.assertTrue(safelist.isSafeTag("b"));
    }

    @Test
    public void basicWithImagesTest() throws Exception {
        safelist.addTags("img", "alt");
        safelist.addAttribute("src", "https://example.com");
        Safelist none = new Safelist();
        Assert.assertFalse(safelist.isSafeTag("script"));
        Assert.assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxedTest() throws Exception {
        safelist.addTags("a", "b");
        safelist.addAttribute("href", "https://example.com");
        Safelist none = new Safelist();
        Assert.assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void copyConstructorTest() throws Exception {
        Safelist safelist1 = new Safelist();
        Safelist safelist2 = safelist1.copy();
        AssertSame(safelist1, safelist2);
        assertTrue(!safelist1.equals(safelist2));
    }

}