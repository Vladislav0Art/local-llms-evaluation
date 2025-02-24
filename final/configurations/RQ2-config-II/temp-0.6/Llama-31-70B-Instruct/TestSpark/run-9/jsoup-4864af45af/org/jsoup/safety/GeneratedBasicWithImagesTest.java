package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Safelist basicWithImages = Safelist.basicWithImages();
        Assert.assertNotNull(basicWithImages);
        Assert.assertEquals("[p, br, ul, ol, li, div, span, strong, pre, b, i, em, code, sub, sup, img]", basicWithImages.getTags().toString());
    }

}