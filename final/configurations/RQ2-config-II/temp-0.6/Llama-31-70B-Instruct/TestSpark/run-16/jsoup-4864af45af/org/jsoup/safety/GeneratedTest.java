package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Element element;

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.getProtocols().size());
        assertEquals(0, safelist.getAttributes().size());
        assertEquals(0, safelist.getTags().size());
        assertFalse(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("div", element, new Attribute("class", "test")));
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertEquals(0, safelist.getProtocols().size());
        assertEquals(2, safelist.getAttributes().size());
        assertEquals(3, safelist.getTags().size());
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeAttribute("div", element, new Attribute("class", "test")));
    }

}