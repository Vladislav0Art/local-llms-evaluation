package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBasic_SafelistCreated {

    @Test
    public void basic_SafelistCreated() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
    }

}