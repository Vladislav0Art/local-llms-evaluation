package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();
        String result = Attributes.checkNotNull(null);
        Assert.assertNull(result);
    }

}