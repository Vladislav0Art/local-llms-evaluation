package org.jsoup.safety;

import static org.jsoup.safety.Safelist.none;
import static org.jsoup.safety.Safelist.simpleText;
import static org.jsoup.safety.Safelist.basic;
import static org.jsoup.safety.Safelist.basicWithImages;
import static org.jsoup.safety.Safelist.relaxed;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist copy = mock(Safelist.class);
        Safelist safelist = new Safelist(copy);
        assertNotNull(safelist);
    }

}