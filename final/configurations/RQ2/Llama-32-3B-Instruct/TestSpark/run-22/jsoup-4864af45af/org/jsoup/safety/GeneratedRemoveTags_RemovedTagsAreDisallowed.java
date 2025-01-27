package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GeneratedRemoveTags_RemovedTagsAreDisallowed {

    @Test
    public void removeTags_RemovedTagsAreDisallowed() {
        Safelist safelist = Safelist.addTags("script", "noscript").removeTags("script", "noscript");
        assertFalse(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("img"));
    }

}