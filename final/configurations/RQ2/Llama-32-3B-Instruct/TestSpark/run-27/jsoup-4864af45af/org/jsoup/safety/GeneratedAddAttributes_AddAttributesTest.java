package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedAddAttributes_AddAttributesTest {

    @Test
    public void addAttributes_AddAttributesTest() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "text");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt", "text")));
    }

}