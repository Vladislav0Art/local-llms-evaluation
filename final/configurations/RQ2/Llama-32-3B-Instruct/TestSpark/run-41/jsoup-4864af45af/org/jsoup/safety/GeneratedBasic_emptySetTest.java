package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_emptySetTest {

    @Test
    public void basic_emptySetTest() {
        Set<String> set = new HashSet<>();
        Safelist safeList = Safelist.basic();
        assertTrue(safeList.removeTags(set).isEmpty());
    }

}