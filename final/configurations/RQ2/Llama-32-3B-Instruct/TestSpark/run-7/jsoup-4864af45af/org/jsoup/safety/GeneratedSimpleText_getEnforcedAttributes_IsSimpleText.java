package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSimpleText_getEnforcedAttributes_IsSimpleText {

    @Test
    public void simpleText_getEnforcedAttributes_IsSimpleText() {
        Safelist safelist = Safelist.simpleText();
        Set<String> enforcedAttributes = new HashSet<>(safelist.getEnforcedAttributes("text"));
        Validate.isTrue(enforcedAttributes.contains("text"));
    }

}