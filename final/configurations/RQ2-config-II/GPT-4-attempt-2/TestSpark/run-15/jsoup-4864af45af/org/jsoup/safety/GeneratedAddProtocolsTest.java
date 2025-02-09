package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = new Safelist();
        String tag = "a";
        String attr = "href";
        safelist.addProtocols(tag, attr, "http");
        assertTrue(safelist.isSafeProtocol(tag, attr));
    }

}