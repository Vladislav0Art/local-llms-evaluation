package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Assert.assertEquals(Safelist.none().removeProtocols("a", "href", "ftp").toString(), new Safelist().toString());
    }

}