package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

public class GeneratedAddProtocols {

    @Test
    public void addProtocols() {
        String tag = "img";
        String attribute = "src";
        String[] protocols = {"http", "https"};
        Safelist safelist = Safelist.addProtocols(tag, attribute, protocols).addTags("a", "b");
        boolean isSafeAttribute = safelist.isSafeAttribute(tag, null, new Attribute(attribute, protocols));
        assertTrue(isSafeAttribute);
    }

}