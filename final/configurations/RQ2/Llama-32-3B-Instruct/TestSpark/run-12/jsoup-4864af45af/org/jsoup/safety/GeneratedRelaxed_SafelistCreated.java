package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedRelaxed_SafelistCreated {

    @Test
    public void relaxed_SafelistCreated() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
    }

}