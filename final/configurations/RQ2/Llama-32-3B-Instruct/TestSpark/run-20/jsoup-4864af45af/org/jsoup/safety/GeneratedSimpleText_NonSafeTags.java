package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_NonSafeTags {

    @Test
    public void simpleText_NonSafeTags() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("javascript"));
    }

}