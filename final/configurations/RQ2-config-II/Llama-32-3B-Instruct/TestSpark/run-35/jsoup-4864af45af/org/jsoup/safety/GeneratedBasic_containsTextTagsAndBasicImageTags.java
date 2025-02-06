package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_containsTextTagsAndBasicImageTags {

    @Test
    public void basic_containsTextTagsAndBasicImageTags() {
        Safelist list = Safelist.basic();
        assertTrue(list.isSafeTag("p"));
        assertTrue(list.isSafeTag("span"));
        assertTrue(list.isSafeTag("img"));
    }

}