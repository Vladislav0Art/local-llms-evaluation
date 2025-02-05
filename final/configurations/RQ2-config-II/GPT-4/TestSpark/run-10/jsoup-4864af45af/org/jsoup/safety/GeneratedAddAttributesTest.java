package org.jsoup.safety;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("div", "id", "class");

        assertTrue(safelist.isSafeAttribute("div", null, new Attribute("id", "value")));
        assertTrue(safelist.isSafeAttribute("div", null, new Attribute("class", "value")));
    }

}