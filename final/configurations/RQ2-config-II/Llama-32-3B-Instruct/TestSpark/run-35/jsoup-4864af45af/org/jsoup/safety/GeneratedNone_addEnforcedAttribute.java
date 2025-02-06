package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedNone_addEnforcedAttribute {

    @Test
    public void none_addEnforcedAttribute() {
        Safelist list = Safelist.none();
        Safelist newList = list.addEnforcedAttribute("script", "src", "https://example.com/script.js");
        assertTrue(newList.isSafeAttribute("script", null, new Attribute("src", "https://example.com/script.js")));
    }

}