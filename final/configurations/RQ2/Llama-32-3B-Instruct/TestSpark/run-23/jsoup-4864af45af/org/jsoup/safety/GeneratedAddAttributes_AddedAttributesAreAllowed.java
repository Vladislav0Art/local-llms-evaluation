package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedAddAttributes_AddedAttributesAreAllowed {

    @Test
    public void addAttributes_AddedAttributesAreAllowed() {
        Safelist safeList = Safelist.addTags("div");
        when(Safelist.class.isSafeAttribute("id", null, new Attribute())).thenReturn(true);
        Safelist safeList2 = safeList.addAttributes("div", "id", "test");
        assertTrue(safeList2.getEnforcedAttributes("div").size() > 0);
    }

}