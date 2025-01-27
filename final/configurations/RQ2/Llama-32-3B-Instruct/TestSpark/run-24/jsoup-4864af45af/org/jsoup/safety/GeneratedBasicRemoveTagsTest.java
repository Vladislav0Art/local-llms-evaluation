package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicRemoveTagsTest {

    @Test
    public void basicRemoveTagsTest() {
        Safelist sut = Safelist.basic();
        safelistAddTagsAndRemoveTags(sut, "img", "a");
        assertFalse(sut.getSafeTags().contains("img"));
        assertFalse(sut.getSafeTags().contains("a"));
    }

}