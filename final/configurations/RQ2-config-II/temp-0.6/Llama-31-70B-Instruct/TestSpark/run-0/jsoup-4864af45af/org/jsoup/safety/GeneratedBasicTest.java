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

public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist safelist = basic();
        assertNotNull(safelist);
    }

}