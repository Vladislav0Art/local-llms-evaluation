package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class GeneratedSafelistInstanceFromCopyTest {

    @Test
    public void safelistInstanceFromCopyTest() {
        Safelist safelist1 = new Safelist();
        Safelist safelist2 = new Safelist(safelist1);
        Assert.assertNotNull(safelist2);
    }

}