package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedAddTags {

    @Test
    public void addTags() {
        Safelist added = new Safelist();
        added.addTags("span", "class");
        Map<String, String[]> tags = new HashMap<>();
        tags.put("span", new String[]{"class"});
        assertEquals(1, added.isSafeTag("span"));
    }

}