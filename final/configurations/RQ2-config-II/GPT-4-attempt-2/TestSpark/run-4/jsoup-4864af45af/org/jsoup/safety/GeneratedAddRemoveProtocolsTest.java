package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAddRemoveProtocolsTest {

    @Test
    public void addRemoveProtocolsTest() {
        Safelist safelist = new Safelist();
        safelist.addProtocols("tag1", "attr1", "https", "http");
    }

}