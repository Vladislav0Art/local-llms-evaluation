package org.jsoup.safety;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedSafelistConstructorTest {

    @Test
    public void safelistConstructorTest() {
        Safelist safelist = new Safelist();
        Assert.assertNotNull(safelist);
    }

}