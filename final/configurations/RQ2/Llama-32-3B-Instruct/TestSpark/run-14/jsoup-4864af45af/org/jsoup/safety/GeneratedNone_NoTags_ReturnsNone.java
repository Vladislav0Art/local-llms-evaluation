package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedNone_NoTags_ReturnsNone {

    @Test
    public void none_NoTags_ReturnsNone() {
        Safelist result = Safelist.none();
        assertTrue(result.isEmpty());
    }

}