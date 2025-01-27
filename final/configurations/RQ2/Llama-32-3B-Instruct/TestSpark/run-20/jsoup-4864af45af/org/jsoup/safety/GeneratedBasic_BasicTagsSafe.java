package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedBasic_BasicTagsSafe {

    @Test
    public void basic_BasicTagsSafe() {
        Safelist basic = Safelist.basic();
        assertTrue(basic.isSafeTag("a"));
        assertTrue(basic.isSafeTag("link"));
    }

}