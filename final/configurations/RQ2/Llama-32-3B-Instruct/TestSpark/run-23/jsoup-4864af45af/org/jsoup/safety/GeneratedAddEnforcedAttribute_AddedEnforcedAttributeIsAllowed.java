package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedAddEnforcedAttribute_AddedEnforcedAttributeIsAllowed {

    @Test
    public void addEnforcedAttribute_AddedEnforcedAttributeIsAllowed() {
        Safelist safeList = Safelist.addTags("div");
        when(Safelist.class.isSafeAttribute("data-test", null, new Attribute())).thenReturn(true);
        Safelist safeList2 = safeList.addEnforcedAttribute("div", "data-test", "test");
        assertEquals(1, safeList2.getEnforcedAttributes("div").size());
    }

}