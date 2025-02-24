package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicTest {

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        Assert.assertNotNull(basic);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong, pre, b, i, em, code, sub, sup]", basic.getTags().toString());
    }

}