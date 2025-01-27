package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNoneCanBeCopiedTest {

    @Test
    public void noneCanBeCopiedTest() {
        Safelist sut = Safelist.none();
        Safelist copy = new Safelist(sut);
        assertTrue(copy.isNone());
    }

}