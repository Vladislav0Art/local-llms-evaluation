package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        String safeTag = "safe";
        Safelist safelist = new Safelist().addTags(safeTag);
        Assert.assertTrue(safelist.isSafeTag(safeTag));
    }

}