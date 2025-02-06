package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedPreserveRelativeLinks_PreserveLinks {

    @Test
    public void preserveRelativeLinks_PreserveLinks() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.preserveRelativeLinks(false));
        assertTrue(safelist.preserveRelativeLinks(true));
    }

}