package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        final Safelist safelist = new Safelist();
        safelist.addAttributes("a", "href");
        safelist.removeAttributes("a", "href");
        assertFalse(safelist.isSafeAttribute("a", new Element("a"), new Attribute("href", "")));
    }

}