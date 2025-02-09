package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNone_emptySetTest {

    @Test
    public void none_emptySetTest() {
        Set<String> set = new HashSet<>();
        Safelist safeList = Safelist.none();
        assertTrue(safeList.addTags(set).isEmpty());
    }

}