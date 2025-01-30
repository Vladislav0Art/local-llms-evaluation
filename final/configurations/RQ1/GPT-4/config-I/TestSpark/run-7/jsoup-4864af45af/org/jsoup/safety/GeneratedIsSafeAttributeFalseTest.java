package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsSafeAttributeFalseTest {

    @Test
    public void isSafeAttributeFalseTest() {
        Safelist safelist = Safelist.none();
        Assert.assertFalse(safelist.isSafeAttribute("a", new Element("<a></a>"), new Attribute("href", "")));
    }

}