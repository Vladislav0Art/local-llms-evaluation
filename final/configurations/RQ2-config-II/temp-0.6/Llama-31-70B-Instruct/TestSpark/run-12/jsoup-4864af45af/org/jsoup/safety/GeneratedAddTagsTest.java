package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddTagsTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.getTags().isEmpty());
        safelist.addTags("a", "img");
        assertEquals(2, safelist.getTags().size());
        assertTrue(safelist.getTags().contains("a"));
        assertTrue(safelist.getTags().contains("img"));
    }

}