package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        String tag = "a";
        String attribute = "href";
        String protocols = "http";
        Safelist result = new Safelist().removeProtocols(tag, attribute, protocols);
        assertNotNull(result);
    }

}