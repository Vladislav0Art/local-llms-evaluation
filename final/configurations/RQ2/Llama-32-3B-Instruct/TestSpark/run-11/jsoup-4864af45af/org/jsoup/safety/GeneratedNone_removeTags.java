package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedNone_removeTags {

    @Test
    public void none_removeTags() {
        Set<String> expected = new HashSet<>();
        Safelist s = Safelist.none();
        for (String tag : new String[]{"p", "span"}) {
            s = s.addTags(tag);
        }
        assertEquals(expected, s.removeTags("p", "span").getSafeTags());
    }

}