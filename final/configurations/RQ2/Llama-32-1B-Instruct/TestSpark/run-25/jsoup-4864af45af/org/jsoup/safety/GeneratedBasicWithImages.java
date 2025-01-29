package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.util.CharsetUtil.escapeHtml4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GeneratedBasicWithImages {

    @Test
    public void basicWithImages() {
        Safelist basicWithImages = new Safelist.basicWithImages();
        Map<String, Set<String>> tags = new HashMap<>();
        tags.put("img", new HashSet<>());
        basicWithImages.addTags("img", "src");
        basicWithImages.addAttributes("img", "height");
        assertEquals("basic with images", basicWithImages.isSafeTag(""));
    }

}