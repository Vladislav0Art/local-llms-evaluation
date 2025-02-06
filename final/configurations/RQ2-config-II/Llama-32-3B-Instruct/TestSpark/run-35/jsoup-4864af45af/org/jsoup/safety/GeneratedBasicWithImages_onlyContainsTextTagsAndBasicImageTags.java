package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasicWithImages_onlyContainsTextTagsAndBasicImageTags {

    @Test
    public void basicWithImages_onlyContainsTextTagsAndBasicImageTags() {
        Safelist list = Safelist.basicWithImages();
        assertTrue(list.isSafeTag("p"));
        assertTrue(list.isSafeTag("span"));
        assertTrue(list.isSafeTag("img"));
    }

}