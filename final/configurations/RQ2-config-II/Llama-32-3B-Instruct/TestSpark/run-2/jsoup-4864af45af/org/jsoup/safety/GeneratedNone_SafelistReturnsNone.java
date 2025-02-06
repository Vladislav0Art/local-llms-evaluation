package org.jsoup.safety;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedNone_SafelistReturnsNone {

    @Test
    public void none_SafelistReturnsNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertEquals(Safelist.NONE, safelist.toString());
    }

}