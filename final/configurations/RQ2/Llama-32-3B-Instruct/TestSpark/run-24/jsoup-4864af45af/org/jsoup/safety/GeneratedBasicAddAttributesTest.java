package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicAddAttributesTest {

    @Test
    public void basicAddAttributesTest() {
        Safelist sut = Safelist.basic();
        safelistAddTagsAndRemoveTags(sut, "img", "a");
        assertEquals(2, sut.getEnforcedAttributes("img").size());
    }

}