package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCopy {

    @Test
    public void testCopy() {
        Safelist safelist = new Safelist().none();
        Safelist copy = Safelist.copy(safelist);
        assertTrue(copy.isSafeTag("a"));
    }

}