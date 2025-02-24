package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertTrue(safelist.getProtocols().isEmpty());
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.getProtocols().isEmpty());
        assertTrue(safelist.getTags().contains("p"));
        assertTrue(safelist.getTags().contains("br"));
        assertTrue(safelist.getTags().contains("blockquote"));
        assertTrue(safelist.getTags().contains("cite"));
        assertTrue(safelist.getTags().contains("code"));
    }

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