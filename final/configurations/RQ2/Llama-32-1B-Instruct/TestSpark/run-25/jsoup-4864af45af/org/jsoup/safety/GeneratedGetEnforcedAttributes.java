package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedGetEnforcedAttributes {

    @Test
    public void getEnforcedAttributes() {
        Safelist added = new Safelist();
        Map<String, Set<String>> tags = new HashMap<>();
        tags.put("span", new HashSet<>());
        assertEquals(1, added.getEnforcedAttributes("span").size());
    }

}