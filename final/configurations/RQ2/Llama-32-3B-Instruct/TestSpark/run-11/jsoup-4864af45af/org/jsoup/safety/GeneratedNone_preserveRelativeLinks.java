package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedNone_preserveRelativeLinks {

    @Test
    public void none_preserveRelativeLinks() {
        boolean expected = true;
        Safelist s = Safelist.none();
        assertTrue(s.preserveRelativeLinks(true));
        assertFalse(s.preserveRelativeLinks(false));
    }

}