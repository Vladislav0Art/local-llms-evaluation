package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNone_SimpleTextTest {

    @Test
    public void none_SimpleTextTest() {
        Safelist safelist = Safelist.none();
        assertEquals(Safelist.simpleText(), safelist);
    }

}