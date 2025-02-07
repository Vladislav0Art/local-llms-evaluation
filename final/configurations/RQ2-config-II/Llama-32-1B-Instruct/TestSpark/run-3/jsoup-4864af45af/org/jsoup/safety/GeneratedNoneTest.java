package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNoneTest {

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

}