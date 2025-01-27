package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNoneIsNoneTest {

    @Test
    public void noneIsNoneTest() {
        Safelist sut1 = Safelist.none();
        Safelist sut2 = Safelist.none();
        assertTrue(sut1.isNone());
        assertTrue(sut2.isNone());
    }

}