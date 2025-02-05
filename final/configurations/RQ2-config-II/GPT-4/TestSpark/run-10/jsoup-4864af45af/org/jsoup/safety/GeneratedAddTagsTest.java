package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        safelist.addTags("p", "div");

        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
    }

}