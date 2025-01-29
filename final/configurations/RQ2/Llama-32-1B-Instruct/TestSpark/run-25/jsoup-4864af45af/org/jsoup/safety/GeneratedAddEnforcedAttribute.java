package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedAddEnforcedAttribute {

    @Test
    public void addEnforcedAttribute() {
        Safelist added = new Safelist();
        added.addEnforcedAttribute("a", "href", "abc");
        Map<String, String> attributes = new HashMap<>();
        attributes.put("a", new String[]{"href"});
        assertEquals(1, added.isSafeTag("a"));
    }

}