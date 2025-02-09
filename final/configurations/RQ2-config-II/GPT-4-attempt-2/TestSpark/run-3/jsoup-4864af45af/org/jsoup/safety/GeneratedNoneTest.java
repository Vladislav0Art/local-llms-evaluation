package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsAnything.anything;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Assert.assertThat(Safelist.none(), anything());
    }

}