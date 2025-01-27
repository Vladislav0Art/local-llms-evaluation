package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.helper.Validate;

public class GeneratedBasicPreserveRelativeLinksTest {

    @Test
    public void basicPreserveRelativeLinksTest() {
        Safelist sut = Safelist.basic();
        assertTrue(sut.preserveRelativeLinks(true));
    }
}

public class Util {

    private static final Set<String> SAFE_TAGS = new HashSet<>(Arrays.asList("html", "p", "span"));
    private static final Map<String, String[]> SAFE_ATTRIBUTES = new HashMap<>();
    private static final Map<String, String[]> SAFE_PROTOCOLS = new HashMap<>();

    public static void safelistAddTagsAndRemoveTags(Safelist sut, String... tags) {
        for (String tag : tags) {
            if (!SAFE_TAGS.contains(tag)) {
                sut.addTag(tag);
            } else {
                sut.removeTag(tag);
            }
        }
        sut.removeTags(tags);
    }

}