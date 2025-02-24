package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRemoveTags {

    @Test
    public void testRemoveTags() {
        Safelist actual = new Safelist();
        Safelist result = actual.removeTags("tag1", "tag2");
        assertNotNull(result);
    }

}