package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddAttributes_SafelistModification {

    @Test
    public void addAttributes_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "alt");
        safelist = Safelist.addAttributes("img", "src", "https://example.com/image.jpg");
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}