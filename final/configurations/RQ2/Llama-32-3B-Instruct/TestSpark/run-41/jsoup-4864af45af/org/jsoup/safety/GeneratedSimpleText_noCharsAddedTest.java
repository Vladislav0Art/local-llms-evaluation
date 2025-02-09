package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSimpleText_noCharsAddedTest {

    @Test
    public void simpleText_noCharsAddedTest() {
        Set<String> set = new HashSet<>();
        Safelist safeList = Safelist.simpleText();
        assertFalse(safeList.addTags(set).containsAny(set));
    }

}