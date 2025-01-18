package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Safelist;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist result = Safelist.none();
        Assert.assertNotNull(result);
    }

}