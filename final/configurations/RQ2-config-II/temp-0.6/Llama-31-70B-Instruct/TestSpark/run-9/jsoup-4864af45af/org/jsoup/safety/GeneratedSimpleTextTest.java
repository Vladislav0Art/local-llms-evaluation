package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        Assert.assertNotNull(simpleText);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong]", simpleText.getTags().toString());
    }

}