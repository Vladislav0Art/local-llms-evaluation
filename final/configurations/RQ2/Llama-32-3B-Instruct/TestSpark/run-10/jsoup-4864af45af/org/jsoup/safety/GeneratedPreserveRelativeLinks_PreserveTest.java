package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedPreserveRelativeLinks_PreserveTest {

    @Test
    public void preserveRelativeLinks_PreserveTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("/a"));
        assertFalse(safelist.isSafeTag("<a>"));
    }

}