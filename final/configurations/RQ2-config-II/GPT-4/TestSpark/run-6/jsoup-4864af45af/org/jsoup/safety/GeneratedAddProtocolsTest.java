package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String[] protocols = {"http", "https"};
        Safelist result = safelist.addProtocols("tag", "attr", protocols);
        assertNotNull(result);
    }

}