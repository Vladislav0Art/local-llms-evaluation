package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveTagsTest {

    @Test
    public void removeTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        safelist.removeTags("div");
        assertFalse(safelist.isSafeTag("div"));
    }

}