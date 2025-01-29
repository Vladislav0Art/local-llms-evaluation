package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedBasic {

    @Test
    public void basic() {
        Safelist basic = new Safelist.basic();
        Map<String, Set<String>> tags = new HashMap<>();
        tags.put("a", new HashSet<>());
        basic.addTags("a", "class");
        basic.addAttributes("a", "href=abc");
        assertEquals("basic", basic.isSafeTag(""));
    }

}