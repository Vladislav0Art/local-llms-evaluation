package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String tagName = "span";
        Map<String, Object> settings = new HashMap<>();
        settings.put(ParseSettings.SrcRootUrl, "https://example.com");
        Tag tag = new Tag();
        assertEquals(tagenormalname(tagName), tag.normalName(settings));
    }

}