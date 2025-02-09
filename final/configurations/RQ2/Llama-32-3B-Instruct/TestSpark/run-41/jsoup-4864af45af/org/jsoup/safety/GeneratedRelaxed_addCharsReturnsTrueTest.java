package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRelaxed_addCharsReturnsTrueTest {

    @Test
    public void relaxed_addCharsReturnsTrueTest() {
        Set<String> set = new HashSet<>(Arrays.asList("img", "a"));
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.addTags(set));
    }

}