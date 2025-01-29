package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        Safelist added = new Safelist();
        added.addProtocols("", "", "https://example.com/protocol");
        Map<String, String> protocols = new HashMap<>();
        protocols.put("", null);
        assertEquals(1, added.isSafeTag("a"));
    }

}