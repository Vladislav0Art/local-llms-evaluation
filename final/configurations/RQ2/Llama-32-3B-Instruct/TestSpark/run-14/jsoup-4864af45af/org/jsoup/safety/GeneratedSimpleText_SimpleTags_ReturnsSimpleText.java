package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedSimpleText_SimpleTags_ReturnsSimpleText {

    @Test
    public void simpleText_SimpleTags_ReturnsSimpleText() {
        Safelist result = Safelist.simpleText();
        assertTrue(result.getSafeTags().contains("img"));
        assertTrue(result.getSafeTags().contains("br"));
    }

}