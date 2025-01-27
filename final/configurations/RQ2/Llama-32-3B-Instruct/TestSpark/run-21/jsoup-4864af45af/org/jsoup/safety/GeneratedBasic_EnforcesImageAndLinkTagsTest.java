package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_EnforcesImageAndLinkTagsTest {

    @Test
    public void basic_EnforcesImageAndLinkTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("a"));
    }

}