package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRelaxed_RelaxedTagsSafe {

    @Test
    public void relaxed_RelaxedTagsSafe() {
        Safelist relaxed = Safelist.relaxed();
        assertTrue(relaxed.isSafeTag("strong"));
        assertTrue(relaxed.isSafeTag("em"));
    }

}