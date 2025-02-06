package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.HashSet;

public class GeneratedNoneRemoveTags_EmptySetRemovesAllTagsTest {

    @Test
    public void noneRemoveTags_EmptySetRemovesAllTagsTest() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        Safelist newSafelist = safelist.removeTags(tags);
        assertTrue(newSafelist.isSafeTag(""));
    }

}