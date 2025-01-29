package org.jsoup.safety;

import org.junit.Test;
import org.jsoup.helper.Validate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestSimpleText {

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("a"));
    }

}