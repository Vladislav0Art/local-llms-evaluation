package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasicWithImages_SimpleTextTest {

    @Test
    public void basicWithImages_SimpleTextTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertEquals(Safelist.simpleText(), safelist);
    }

}