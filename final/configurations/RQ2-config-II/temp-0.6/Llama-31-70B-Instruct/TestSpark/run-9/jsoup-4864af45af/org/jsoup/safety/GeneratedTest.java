package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void noneTest() {
        Safelist none = Safelist.none();
        Assert.assertNotNull(none);
        Assert.assertEquals("", none.getProtocols().toString());
    }

    @Test
    public void simpleTextTest() {
        Safelist simpleText = Safelist.simpleText();
        Assert.assertNotNull(simpleText);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong]", simpleText.getTags().toString());
    }

    @Test
    public void basicTest() {
        Safelist basic = Safelist.basic();
        Assert.assertNotNull(basic);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong, pre, b, i, em, code, sub, sup]", basic.getTags().toString());
    }

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        Assert.assertNotNull(basicWithImages);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong, pre, b, i, em, code, sub, sup, img]", basicWithImages.getTags().toString());
    }

}