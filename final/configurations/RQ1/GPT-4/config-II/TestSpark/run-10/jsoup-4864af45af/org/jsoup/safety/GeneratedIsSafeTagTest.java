package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeTagTest {

    @Test
    public void isSafeTagTest() {
        Assert.assertEquals(Safelist.none().isSafeTag("a"), false);
    }

}