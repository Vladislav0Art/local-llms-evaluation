package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicCanBeCopiedTest {

    @Test
    public void basicCanBeCopiedTest() {
        Safelist sut1 = Safelist.basic();
        Safelist copy = new Safelist(sut1);
        assertTrue(copy.isBasic());
    }

}