package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNoneAddAttributesTest {

    @Test
    public void noneAddAttributesTest() {
        Safelist sut = Safelist.none();
        safelistAddTagsAndRemoveTags(sut, "p", "span");
        assertEquals(0, sut.getEnforcedAttributes("html").size());
    }

}