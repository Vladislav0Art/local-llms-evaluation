package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedRemoveTags {

    @Test
    public void removeTags() {
        Safelist removed = new Safelist();
        removed.removeTags("a");
        assertEquals(0, removed.isSafeTag("a"));
    }

}