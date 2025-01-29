package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedSimpleText {

    @Test
    public void simpleText() {
        Safelist simpleText = new Safelist.simpleText();
        String result = simpleText.getEnforcedAttributes("a").get(0).getValue();
        assertEquals("a=\"href=abc\"", result);
    }

}