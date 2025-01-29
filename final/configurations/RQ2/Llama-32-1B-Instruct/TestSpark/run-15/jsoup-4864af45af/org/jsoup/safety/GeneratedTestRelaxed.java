package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestRelaxed {

    @Test
    public void testRelaxed() {
        Safelist safelist = Safelist.relativelySafe();
        assertFalse(safelist.isSafeTag("a"));
    }

}