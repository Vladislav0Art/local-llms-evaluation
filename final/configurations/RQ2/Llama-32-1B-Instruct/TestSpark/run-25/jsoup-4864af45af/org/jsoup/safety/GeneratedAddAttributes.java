package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedAddAttributes {

    @Test
    public void addAttributes() {
        Safelist added = new Safelist();
        added.addAttributes("span", "class");
        Map<String, String[]> attributes = new HashMap<>();
        attributes.put("span", new String[]{"class"});
        assertEquals(1, added.isSafeTag("span"));
    }

}