package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        String[] attributes = {"attr1", "attr2"};
        Safelist result = safelist.removeAttributes("tag", attributes);
        assertNotNull(result);
    }

}