package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConstructorWithSafelistTest {

    @Test
    public void constructorWithSafelistTest() {
        Safelist safelist = new Safelist();
        Safelist copy = new Safelist(safelist);
        Assert.assertNotNull(copy);
    }

}