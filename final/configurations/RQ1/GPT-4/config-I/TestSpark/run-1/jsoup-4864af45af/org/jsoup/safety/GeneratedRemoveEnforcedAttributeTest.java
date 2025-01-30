package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveEnforcedAttributeTest {

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeEnforcedAttribute("table", "summary");

        Element el = new Element("table");
        el.attr("summary", "Table Summary");

        // Enforced attribute 'summary' has been removed, it should not be safe anymore.
        assertFalse(safelist.isSafeAttribute("table", el, el.attributes().asList().get(0)));
    }

}