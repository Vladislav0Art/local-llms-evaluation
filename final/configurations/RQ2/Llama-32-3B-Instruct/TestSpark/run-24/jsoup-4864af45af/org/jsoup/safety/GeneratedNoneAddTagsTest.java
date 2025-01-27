package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNoneAddTagsTest {

    @Test
    public void noneAddTagsTest() {
        Safelist sut = Safelist.none();
        safelistAddTagsAndRemoveTags(sut, "p", "span");
        assertTrue(sut.getSafeTags().contains("p"));
        assertFalse(sut.getSafeTags().contains("span"));
    }

}