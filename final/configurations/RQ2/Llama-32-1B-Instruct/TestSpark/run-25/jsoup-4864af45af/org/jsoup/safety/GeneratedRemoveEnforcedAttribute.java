package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedRemoveEnforcedAttribute {

    @Test
    public void removeEnforcedAttribute() {
        Safelist removed = new Safelist();
        removed.removeEnforcedAttribute("span", "class");
        Map<String, String> attributes = new HashMap<>();
        attributes.put("span", new String[]{"class"});
        assertEquals(0, removed.isSafeTag("span"));
    }

}