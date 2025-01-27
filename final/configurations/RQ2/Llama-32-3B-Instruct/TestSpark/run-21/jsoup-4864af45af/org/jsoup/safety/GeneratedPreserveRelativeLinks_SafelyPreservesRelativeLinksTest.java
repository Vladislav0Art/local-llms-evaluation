package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedPreserveRelativeLinks_SafelyPreservesRelativeLinksTest {

    @Test
    public void preserveRelativeLinks_SafelyPreservesRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.preserveRelativeLinks(false));
    }

}