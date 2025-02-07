package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedBasicWithImagesTest {

    private Safelist safelist;

    @Before
    public void setup() {
        safelist = new Safelist();
    }

    @Test
    public void basicWithImagesTest() throws Exception {
        safelist.addTags("img", "alt");
        safelist.addAttribute("src", "https://example.com");
        Safelist none = new Safelist();
        Assert.assertFalse(safelist.isSafeTag("script"));
        Assert.assertTrue(safelist.isSafeTag("img"));
    }

}