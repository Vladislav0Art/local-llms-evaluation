package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedNone {

    @Test
    public void none() {
        Safelist none = new Safelist();
        assertEquals("none", none.isSafeTag(""));
    }

}