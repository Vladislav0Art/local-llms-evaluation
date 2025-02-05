package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedSafelistCopyTest {

    @Test
    public void safelistCopyTest() {
        Safelist safelist = new Safelist(Safelist.basic());
        Assert.assertNotNull(safelist);
    }

}