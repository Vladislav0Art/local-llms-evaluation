package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safeList = new Safelist();
        safeList.addProtocols("tag1", "attr1", "protocol1");
        safeList.removeProtocols("tag1", "attr1", "protocol1");
        Assert.assertFalse(safeList.isSafeProtocol("tag1", "attr1", "protocol1"));
    }

}