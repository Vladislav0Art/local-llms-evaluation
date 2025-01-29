package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRemoveAttributes {

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("class");
        assertTrue(safelist.isSafeTag("a"));
    }

}