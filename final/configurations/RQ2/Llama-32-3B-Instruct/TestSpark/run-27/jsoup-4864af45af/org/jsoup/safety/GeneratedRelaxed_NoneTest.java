package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRelaxed_NoneTest {

    @Test
    public void relaxed_NoneTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotEquals(Safelist.none(), safelist);
    }

}