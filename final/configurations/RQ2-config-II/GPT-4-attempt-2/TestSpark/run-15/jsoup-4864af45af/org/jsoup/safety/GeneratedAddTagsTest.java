package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("div", "p");
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("p"));
    }

}