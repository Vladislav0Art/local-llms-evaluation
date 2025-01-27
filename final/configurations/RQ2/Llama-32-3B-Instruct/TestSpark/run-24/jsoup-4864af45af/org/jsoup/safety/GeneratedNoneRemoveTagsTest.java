package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedNoneRemoveTagsTest {

    @Test
    public void noneRemoveTagsTest() {
        Safelist sut = Safelist.none();
        safelistAddTagsAndRemoveTags(sut, "p", "span");
        assertFalse(sut.getSafeTags().contains("p"));
        assertTrue(sut.getSafeTags().contains("span"));
    }

}