package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedRemoveProtocols_SafelistModification {

    @Test
    public void removeProtocols_SafelistModification() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "src");
        safelist = Safelist.removeProtocols("img", "src", new String[]{"https:"});
        assertNotNull(safelist);
        assertEquals(1, ((Attributes) safelist.getEnforcedAttributes("img")).size());
    }

}