package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedAddTags_AddedTagsAreAllowed {

    @Test
    public void addTags_AddedTagsAreAllowed() {
        Safelist safelist = Safelist.addTags("a", "img");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

}