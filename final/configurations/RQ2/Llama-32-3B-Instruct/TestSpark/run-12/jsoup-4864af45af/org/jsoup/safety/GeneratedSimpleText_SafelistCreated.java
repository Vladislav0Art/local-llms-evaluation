package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedSimpleText_SafelistCreated {

    @Test
    public void simpleText_SafelistCreated() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
    }

}