package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedConstructorCopyTest {

    @Test
    public void constructorCopyTest() {
        Safelist safelist = new Safelist(Safelist.basic());
        assertNotNull(safelist);
    }

}