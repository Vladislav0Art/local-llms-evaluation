package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedRemoveAttributes_RemoveAttributesTest {

    @Test
    public void removeAttributes_RemoveAttributesTest() {
        Safelist safelist = Safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt", "text")));
    }

}