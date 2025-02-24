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

public class GeneratedRelaxedTest {

    @Test
    public void relaxedTest() {
        Safelist safelist = relaxed();
        assertNotNull(safelist);
    }

}