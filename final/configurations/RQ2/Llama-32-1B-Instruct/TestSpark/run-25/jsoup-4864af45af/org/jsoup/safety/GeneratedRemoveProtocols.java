package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        Safelist removed = new Safelist();
        removed.removeProtocols("", "", "https://example.com/protocol");
        Map<String, String> protocols = new HashMap<>();
        protocols.put("", null);
        assertEquals(0, removed.isSafeTag("a"));
    }

}