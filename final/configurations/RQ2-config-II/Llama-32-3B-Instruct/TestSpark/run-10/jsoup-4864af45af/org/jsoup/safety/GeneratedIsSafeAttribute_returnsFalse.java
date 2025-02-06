package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedIsSafeAttribute_returnsFalse {

    @Test
    public void isSafeAttribute_returnsFalse() {
        String tagName = "tag";
        Element el = new Element();
        Attribute attr = new Attribute();
        assertFalse(Safelist.none().isSafeAttribute(tagName, el, attr));
    }

}