package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "a");
        safelist.removeTags("a");
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("a"));
    }

}