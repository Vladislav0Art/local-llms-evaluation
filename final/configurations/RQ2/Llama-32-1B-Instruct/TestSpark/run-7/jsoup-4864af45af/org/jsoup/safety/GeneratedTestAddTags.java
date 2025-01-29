package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("img");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}