package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedRemoveAttributes_RemovedAttributesAreNotAllowed {

    @Test
    public void removeAttributes_RemovedAttributesAreNotAllowed() {
        Safelist safeList = Safelist.addTags("div");
        when(Safelist.class.isSafeAttribute("removed", null, new Attribute())).thenReturn(false);
        Safelist safeList2 = safeList.removeAttributes("div", "removed");
        assertTrue(!safeList2.getEnforcedAttributes("div").containsKey("removed"));
    }

}