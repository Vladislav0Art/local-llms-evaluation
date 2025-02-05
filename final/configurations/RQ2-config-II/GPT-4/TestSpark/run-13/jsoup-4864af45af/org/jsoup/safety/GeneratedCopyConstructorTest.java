package org.jsoup.safety;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist();
        Safelist result = new Safelist(safelist);
        Assert.assertNotSame(result, safelist);
    }

}