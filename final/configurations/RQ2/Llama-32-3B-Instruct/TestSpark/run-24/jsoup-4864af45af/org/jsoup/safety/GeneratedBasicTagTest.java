package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicTagTest {

    @Test
    public void basicTagTest() {
        assertTrue(Safelist.basic().isSafeTag("html"));
        assertFalse(Safelist.basic().isSafeTag("script"));
    }

}