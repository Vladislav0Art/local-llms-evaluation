package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        safelist.removeTags("img");
        assertTrue(safelist.isSafeTag("a"));
    }

}