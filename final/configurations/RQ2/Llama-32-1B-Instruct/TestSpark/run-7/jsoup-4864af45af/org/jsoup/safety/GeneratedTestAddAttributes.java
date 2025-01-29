package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("class", "test");
        assertEquals(1, safelist.getEnforcedAttributes("class").size());
    }

}