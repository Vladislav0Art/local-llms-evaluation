package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicRemoveAttributesTest {

    @Test
    public void basicRemoveAttributesTest() {
        Safelist sut = Safelist.basic();
        safelistAddTagsAndRemoveTags(sut, "img", "a");
        assertEquals(0, sut.getEnforcedAttributes("img").size());
    }

}