package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedBasic_RemoveTags {

    @Test
    public void basic_RemoveTags() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTagsToRemove = new HashSet<>();
        expectedTagsToRemove.add("img", "style");
        basic = basic.removeTags(expectedTagsToRemove);
        assertFalse(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("style"));
    }

}