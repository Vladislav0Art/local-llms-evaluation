package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_removeCharsReturnsFalseTest {

    @Test
    public void basic_removeCharsReturnsFalseTest() {
        Set<String> set = new HashSet<>(Arrays.asList("img", "a"));
        Safelist safeList = Safelist.basic();
        assertFalse(safeList.removeTags(set));
    }

}