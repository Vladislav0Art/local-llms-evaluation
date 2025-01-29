package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddEnforcedAttribute {

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("img", "src", "https://example.com/image.jpg");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

}