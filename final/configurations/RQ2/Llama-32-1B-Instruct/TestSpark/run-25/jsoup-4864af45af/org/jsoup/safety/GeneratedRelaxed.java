package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedRelaxed {

    @Test
    public void relaxed() {
        Safelist relaxed = new Safelist(relaxed());
        Set<String> tags = new HashSet<>();
        tags.add("a");
        assertTrue(relaxed.isSafeTag("a"));
    }

}