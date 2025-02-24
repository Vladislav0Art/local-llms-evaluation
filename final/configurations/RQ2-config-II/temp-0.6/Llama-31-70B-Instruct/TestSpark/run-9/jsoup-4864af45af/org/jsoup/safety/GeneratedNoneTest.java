package org.jsoup.safety;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNoneTest {

    @Test
    public void noneTest() {
        Safelist none = Safelist.none();
        Assert.assertNotNull(none);
        Assert.assertEquals("", none.getProtocols().toString());
    }

}