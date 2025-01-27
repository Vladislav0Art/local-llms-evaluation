package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedIsSafeTag_EmptyString_SafeAttribute {

    @Test
    public void isSafeTag_EmptyString_SafeAttribute() {
        Attributes attributes = new Attributes();
        assertTrue(Safelist.none().isSafeAttribute("", null, new Attribute()));
    }

}