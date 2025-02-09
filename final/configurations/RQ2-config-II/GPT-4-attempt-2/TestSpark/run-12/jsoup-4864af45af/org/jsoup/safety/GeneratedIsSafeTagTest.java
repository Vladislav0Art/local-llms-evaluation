package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        String tag = "p";
        boolean result = new Safelist().isSafeTag(tag);
        assertTrue(result);
    }

}