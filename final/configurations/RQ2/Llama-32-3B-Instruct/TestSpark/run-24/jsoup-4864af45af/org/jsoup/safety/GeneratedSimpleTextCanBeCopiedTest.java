package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedSimpleTextCanBeCopiedTest {

    @Test
    public void simpleTextCanBeCopiedTest() {
        Safelist sut1 = Safelist.simpleText();
        Safelist copy = new Safelist(sut1);
        assertEquals(sut1, copy);
    }

}