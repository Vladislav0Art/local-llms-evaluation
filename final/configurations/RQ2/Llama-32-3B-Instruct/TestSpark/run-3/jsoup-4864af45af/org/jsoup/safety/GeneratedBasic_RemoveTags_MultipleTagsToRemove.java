package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedBasic_RemoveTags_MultipleTagsToRemove {

    @Test
    public void basic_RemoveTags_MultipleTagsToRemove() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTagsToRemove = new HashSet<>();
        expectedTagsToRemove.add("img");
        expectedTagsToRemove.add("style");
        expectedTagsToRemove.add("script");
        basic = basic.removeTags(expectedTagsToRemove);
        assertFalse(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("style"));
        assertFalse(basic.isSafeTag("script"));
    }

}