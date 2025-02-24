package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAddTags {

    @Test
    public void testAddTags() {
        Safelist actual = new Safelist();
        Safelist result = actual.addTags("tag1", "tag2");
        assertNotNull(result);
    }

}