package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedBasic_NoneTest {

    @Test
    public void basic_NoneTest() {
        Safelist safelist = Safelist.basic();
        assertNotEquals(Safelist.none(), safelist);
    }

}