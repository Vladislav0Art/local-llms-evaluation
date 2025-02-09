package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = new Safelist();
        String tag = "p";
        String attr = "align";
        safelist.addAttributes(tag, attr);
        safelist.removeAttributes(tag, attr);
        assertFalse(safelist.addAttributes(tag, attr).isTagAttributes("align"));
    }

}