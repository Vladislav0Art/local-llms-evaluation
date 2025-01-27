package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedBasicWithImages_SafelistCreated {

    @Test
    public void basicWithImages_SafelistCreated() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
    }

}