package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSimpleTextTest {

    private Safelist safelist;

    @Before
    public void setup() {
        safelist = new Safelist();
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

}