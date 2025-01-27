package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedSimpleText_addTags {

    @Test
    public void simpleText_addTags() {
        Set<String> expected = new HashSet<>(Set.of("p", "span"));
        assertEquals(expected, Safelist.simpleText().addTags("p", "span").getSafeTags());
    }

}