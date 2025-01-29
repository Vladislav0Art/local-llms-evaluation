package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestPreserveRelativeLinks {

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(Safelist.Safelist.isSafeTag("a"));
        assertFalse(Safelist.Safelist.isSafeTag("img"));
    }

}