package org.jsoup.safety;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedRemoveAttributesTest {

    //Testing null variables during instantiation

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeAttributes("img", "alt");
        assertNotNull(safelist);
    }

}