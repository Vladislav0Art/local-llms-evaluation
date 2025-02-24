package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.getProtocols().size());
        assertEquals(0, safelist.getTags().size());
        assertEquals(0, safelist.getAttributes().size());
        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("div", Mockito.mock(Element.class), Mockito.mock(Attribute.class)));
    }

}