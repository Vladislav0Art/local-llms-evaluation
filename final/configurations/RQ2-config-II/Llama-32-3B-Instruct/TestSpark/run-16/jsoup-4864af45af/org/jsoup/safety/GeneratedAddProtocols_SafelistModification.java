package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedAddProtocols_SafelistModification {

    @Test
    public void addProtocols_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "src");
        safelist = Safelist.addProtocols("img", "src", new String[]{"https:", "http:"});
        assertNotNull(safelist);
        assertEquals(2, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}