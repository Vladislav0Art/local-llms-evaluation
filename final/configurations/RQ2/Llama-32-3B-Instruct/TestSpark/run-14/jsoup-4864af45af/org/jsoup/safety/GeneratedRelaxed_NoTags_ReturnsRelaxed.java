package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedRelaxed_NoTags_ReturnsRelaxed {

    @Test
    public void relaxed_NoTags_ReturnsRelaxed() {
        Safelist result = Safelist.relaxed();
        assertTrue(result.isEmpty());
    }

}