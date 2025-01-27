package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicAddTagsTest {

    @Test
    public void basicAddTagsTest() {
        Safelist sut = Safelist.basic();
        safelistAddTagsAndRemoveTags(sut, "img", "a");
        assertTrue(sut.getSafeTags().contains("img"));
        assertTrue(sut.getSafeTags().contains("a"));
    }

}