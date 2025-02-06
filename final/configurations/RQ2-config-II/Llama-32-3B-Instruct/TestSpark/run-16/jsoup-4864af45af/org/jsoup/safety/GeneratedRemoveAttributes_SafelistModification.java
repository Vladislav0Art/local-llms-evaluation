package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRemoveAttributes_SafelistModification {

    @Test
    public void removeAttributes_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "alt");
        safelist = Safelist.removeAttributes("img", "src");
        assertNotNull(safelist);
        assertEquals(0, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}