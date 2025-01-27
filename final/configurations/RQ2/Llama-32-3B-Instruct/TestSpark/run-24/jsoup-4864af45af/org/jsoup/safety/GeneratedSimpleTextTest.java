package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist sut = Safelist.simpleText();
        assertEquals(Validate.TAGS, new HashSet<>(Arrays.asList(sut.getSafeTags())));
    }

}