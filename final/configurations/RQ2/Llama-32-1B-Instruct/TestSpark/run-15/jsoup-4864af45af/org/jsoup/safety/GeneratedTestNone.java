package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestNone {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("a"));
    }

}