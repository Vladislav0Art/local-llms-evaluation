package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        String tagName = "span";
        Tag tag = new Tag();
        String normalizedName = Normalizer.normalize(tagName, Normalizer.NFD);
        assertEquals(tag.getNormalName(), normalizedName);
    }

}