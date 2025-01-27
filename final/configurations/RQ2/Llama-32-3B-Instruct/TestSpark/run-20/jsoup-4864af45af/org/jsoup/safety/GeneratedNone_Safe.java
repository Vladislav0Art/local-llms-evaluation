package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNone_Safe {

    @Test
    public void none_Safe() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
    }

}