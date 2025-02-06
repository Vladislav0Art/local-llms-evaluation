package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedRelaxed_containsTextTagsBasicImageTagsAndOtherTags {

    @Test
    public void relaxed_containsTextTagsBasicImageTagsAndOtherTags() {
        Safelist list = Safelist.relaxed();
        assertTrue(list.isSafeTag("p"));
        assertTrue(list.isSafeTag("span"));
        assertTrue(list.isSafeTag("img"));
        assertTrue(list.isSafeTag("a"));
        assertTrue(list.isSafeTag("script"));
    }

}