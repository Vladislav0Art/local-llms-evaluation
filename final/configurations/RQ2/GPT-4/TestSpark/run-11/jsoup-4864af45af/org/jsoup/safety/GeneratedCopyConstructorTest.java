package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist original = Safelist.none();
        Safelist copy = new Safelist(original);
        Assert.assertEquals(original, copy);
    }

}