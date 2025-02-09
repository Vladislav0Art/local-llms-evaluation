package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeAttributeTest {

    @Test
    public void isSafeAttributeTest() {
        Safelist safelist = new Safelist();
        Element el = mock(Element.class);
        Attribute attr = mock(Attribute.class);

        boolean result = safelist.isSafeAttribute("a", el, attr);
        assertFalse(result);
    }

}