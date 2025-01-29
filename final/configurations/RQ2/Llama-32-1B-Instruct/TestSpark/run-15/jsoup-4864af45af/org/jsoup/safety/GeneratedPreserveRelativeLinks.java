package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist.Safelist preserveRL = new Safelist.PreserveRelativeLinks(true);
        assertTrue(preserveRL.preserveRelativeLinks(true));
        assertFalse(preserveRL.preserveRelativeLinks(false));
    }

}