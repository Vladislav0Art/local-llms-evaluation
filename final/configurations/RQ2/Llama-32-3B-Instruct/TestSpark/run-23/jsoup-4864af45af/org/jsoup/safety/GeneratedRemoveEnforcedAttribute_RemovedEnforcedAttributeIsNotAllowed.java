package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedRemoveEnforcedAttribute_RemovedEnforcedAttributeIsNotAllowed {

    @Test
    public void removeEnforcedAttribute_RemovedEnforcedAttributeIsNotAllowed() {
        Safelist safeList = Safelist.addTags("div");
        when(Safelist.class.isSafeAttribute("data-test", null, new Attribute())).thenReturn(true);
        Safelist safeList2 = safeList.removeEnforcedAttribute("div", "data-test");
        assertEquals(0, safeList2.getEnforcedAttributes("div").size());
    }

}