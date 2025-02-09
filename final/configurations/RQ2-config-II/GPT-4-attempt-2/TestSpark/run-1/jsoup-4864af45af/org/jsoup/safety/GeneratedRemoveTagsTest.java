package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("p"));
        safelist.removeTags("p");
        assertFalse(safelist.isSafeTag("p"));
    }

}