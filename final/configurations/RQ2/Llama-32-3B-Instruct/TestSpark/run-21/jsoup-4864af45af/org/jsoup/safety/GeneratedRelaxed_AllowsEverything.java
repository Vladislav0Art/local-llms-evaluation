package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRelaxed_AllowsEverything {

    @Test
    public void relaxed_AllowsEverything() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(saflist.isSafeTag("script"));
    }

}