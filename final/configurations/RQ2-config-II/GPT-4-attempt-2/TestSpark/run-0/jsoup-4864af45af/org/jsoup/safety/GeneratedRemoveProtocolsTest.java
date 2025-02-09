package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        Safelist result = safelist.removeProtocols("tag", "attribute", "protocol1", "protocol2");
        assertNotNull(result);
    }

}