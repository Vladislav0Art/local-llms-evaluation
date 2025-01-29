package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedPreserveRelativeLinks {

    @Test
    public void preserveRelativeLinks() {
        Safelist added = new Safelist();
        assertTrue(added.preserveRelativeLinks(true));
        Map<String, Set<String>> tags = new HashMap<>();
        tags.put("img", new HashSet<>());
        assertEquals("preserve relative links", added.isSafeTag("img"));
    }

}