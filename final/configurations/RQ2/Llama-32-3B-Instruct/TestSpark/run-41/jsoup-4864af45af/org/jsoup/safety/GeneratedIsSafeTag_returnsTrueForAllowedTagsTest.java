package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedIsSafeTag_returnsTrueForAllowedTagsTest {

    @Test
    public void isSafeTag_returnsTrueForAllowedTagsTest() {
        Set<String> tags = new HashSet<>();
        String[] allowedTags = {"img", "a"};
        for (String tag : allowedTags) {
            assertTrue(Safelist.relaxed().isSafeTag(tag));
        }
    }

}