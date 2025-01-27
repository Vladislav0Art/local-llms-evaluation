package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;
import org.jsoup.safety.Safelist;

import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocols_RemovedProtocolsAreNotAllowed {

    @Test
    public void removeProtocols_RemovedProtocolsAreNotAllowed() {
        Safelist safeList = Safelist.addTags("div");
        when(Safelist.class.isSafeAttribute("data-protocol", null, new Attribute())).thenReturn(true);
        Safelist safeList2 = safeList.removeProtocols("div", "data-protocol", "https");
        assertEquals(0, safeList2.getEnforcedAttributes("div").size());
    }

}