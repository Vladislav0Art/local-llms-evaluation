package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocols {

    @Test
    public void removeProtocols() {
        String tag = "img";
        String attribute = "src";
        Safelist safelist = Safelist.removeProtocols(tag, attribute, new String[]{"http", "https"}).addTags("a", "b");
        boolean isSafeAttribute = !safelist.isSafeAttribute(tag, null, new Attribute(attribute));
        assertTrue(isSafeAttribute);
    }

}