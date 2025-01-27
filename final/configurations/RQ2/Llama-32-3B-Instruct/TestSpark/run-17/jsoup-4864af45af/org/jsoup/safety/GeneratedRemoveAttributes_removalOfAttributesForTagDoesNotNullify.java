package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedRemoveAttributes_removalOfAttributesForTagDoesNotNullify {

    @Test
    public void removeAttributes_removalOfAttributesForTagDoesNotNullify() {
        Safelist safelist = Safelist.addAttributes("img", "src", "http://example.com").removeAttributes("img", "src");
        assertNotNull(safelist);
        assertFalse((Boolean) ((HashMap<String, String>) safelist.getEnforcedAttributes("img")).get("src"));
    }

}