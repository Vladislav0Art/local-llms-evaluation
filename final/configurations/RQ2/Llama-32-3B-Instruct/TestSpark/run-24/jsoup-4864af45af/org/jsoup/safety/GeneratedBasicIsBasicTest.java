package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicIsBasicTest {

    @Test
    public void basicIsBasicTest() {
        Safelist sut1 = Safelist.basic();
        Safelist sut2 = Safelist.basic();
        assertTrue(sut1.isBasic());
        assertTrue(sut2.isBasic());
    }

}