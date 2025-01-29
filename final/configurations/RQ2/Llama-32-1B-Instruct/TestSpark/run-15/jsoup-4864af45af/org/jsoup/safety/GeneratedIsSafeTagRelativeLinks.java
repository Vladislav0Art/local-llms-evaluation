package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeTagRelativeLinks {

    @Test
    public void isSafeTagRelativeLinks() {
        Safelist.Safelist preserveRL = new Safelist.PreserveRelativeLinks(true);
        assertTrue(preserveRL.isSafeTag("a"));
    }

}