package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Assert.assertEquals(Safelist.none().addProtocols("a", "href", "ftp", "http", "https", "mailto").toString(), new Safelist().toString());
    }

}