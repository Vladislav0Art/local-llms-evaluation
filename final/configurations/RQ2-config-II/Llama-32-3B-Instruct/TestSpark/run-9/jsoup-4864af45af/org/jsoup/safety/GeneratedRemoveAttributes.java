package org.jsoup.safety;

import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;

public class GeneratedRemoveAttributes {

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.addAttributes("form", "style", "color: red;");
        Safelist safelistWithRemovedAttribute = safelist.removeAttributes("form", "style");
        assertNull(safelistWithRemovedAttribute.getEnforcedAttributes("form").get(0));
    }

}