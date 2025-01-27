package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedSimpleText_removeTags {

    @Test
    public void simpleText_removeTags() {
        Set<String> expected = new HashSet<>();
        Safelist s = Safelist.simpleText();
        for (String tag : new String[]{"p", "span"}) {
            s = s.addTags(tag);
        }
        assertEquals(expected, s.removeTags("p", "span").getSafeTags());
    }

}