package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAddAttributes {

    @Test
    public void testAddAttributes() {
        Safelist actual = new Safelist();
        Safelist result = actual.addAttributes("tag1", "attr1", "attr2");
        assertNotNull(result);
    }

}