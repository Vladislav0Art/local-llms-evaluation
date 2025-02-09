package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedBasicWithImagesTest {

    @Test
    public void basicWithImagesTest() {
        Assert.assertThat(Safelist.basicWithImages(), anything());
    }

}