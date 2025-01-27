package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedSimpleTextIsSimpleTextTest {

    @Test
    public void simpleTextIsSimpleTextTest() {
        Safelist sut1 = Safelist.simpleText();
        Safelist sut2 = Safelist.simpleText();
        assertTrue(sut1.getSafeTags().equals(sut2.getSafeTags()));
    }

}