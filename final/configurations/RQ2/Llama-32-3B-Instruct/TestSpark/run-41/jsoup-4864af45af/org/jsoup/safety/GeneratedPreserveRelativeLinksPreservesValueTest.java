package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinksPreservesValueTest {

    @Test
    public void preserveRelativeLinksPreservesValueTest() {
        boolean preserve = true;
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.preserveRelativeLinks(preserve));
    }

}