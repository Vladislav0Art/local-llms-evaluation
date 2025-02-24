package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertEquals(0, safelist.getProtocols().size());
        assertEquals(3, safelist.getTags().size());
        assertTrue(safelist.getTags().contains("br"));
        assertTrue(safelist.getTags().contains("p"));
        assertTrue(safelist.getTags().contains("span"));
        assertEquals(0, safelist.getAttributes().size());
        assertTrue(safelist.isSafeTag("br"));
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("div", Mockito.mock(Element.class), Mockito.mock(Attribute.class)));
    }

}