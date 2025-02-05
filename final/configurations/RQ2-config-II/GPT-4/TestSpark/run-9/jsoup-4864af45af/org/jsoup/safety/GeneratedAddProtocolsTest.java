package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safeList = new Safelist();
        safeList.addProtocols("tag1", "attr1", "protocol1");
        Assert.assertTrue(safeList.isSafeProtocol("tag1", "attr1", "protocol1"));
    }

}