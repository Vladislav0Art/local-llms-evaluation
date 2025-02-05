package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.mockito.Mockito;

public class GeneratedCopyConstructorTest {

    @Test
    public void copyConstructorTest() {
        Safelist safelist = new Safelist();
        Safelist result = new Safelist(safelist);
        Assert.assertNotNull(result);
    }

}