package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNonePreserveRelativeLinksTest {

    @Test
    public void nonePreserveRelativeLinksTest() {
        Safelist sut = Safelist.none();
        assertTrue(sut.preserveRelativeLinks(true));
    }

}