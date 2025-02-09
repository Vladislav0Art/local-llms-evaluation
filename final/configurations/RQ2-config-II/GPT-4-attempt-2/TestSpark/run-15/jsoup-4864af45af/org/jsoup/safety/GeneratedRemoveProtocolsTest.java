package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "a";
        String attr = "href";
        safelist.addProtocols(tag, attr, "http");
        safelist.removeProtocols(tag, attr, "http");
        assertFalse(safelist.isSafeProtocol(tag, attr));
    }

}