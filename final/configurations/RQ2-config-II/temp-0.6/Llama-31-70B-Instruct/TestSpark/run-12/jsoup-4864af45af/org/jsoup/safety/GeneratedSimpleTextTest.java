package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSimpleTextTest {

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

}