package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedSimpleTextTest {

    @Test
    public void simpleTextTest() {
        Assert.assertThat(Safelist.simpleText(), anything());
    }

}