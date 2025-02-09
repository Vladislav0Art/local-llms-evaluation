package org.jsoup.safety;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedBasic_SafelistShouldNotAllowTagsAndAttributes {

    @BeforeClass
    public static void setup() {
        // Initialize mocks here if needed
    }

    @Test
    public void basic_SafelistShouldNotAllowTagsAndAttributes() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("script", null, null));
    }

}