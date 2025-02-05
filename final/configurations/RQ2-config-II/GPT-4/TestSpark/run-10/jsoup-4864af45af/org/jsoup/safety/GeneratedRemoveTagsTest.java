package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "div");
        safelist.removeTags("div");

        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("div"));
    }

}