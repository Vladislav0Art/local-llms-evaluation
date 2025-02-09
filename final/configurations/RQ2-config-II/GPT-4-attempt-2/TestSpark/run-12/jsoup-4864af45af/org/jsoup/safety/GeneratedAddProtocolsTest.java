package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        String tag = "a";
        String attribute = "href";
        String protocols = "http";
        Safelist result = new Safelist().addProtocols(tag, attribute, protocols);
        assertNotNull(result);
    }

}