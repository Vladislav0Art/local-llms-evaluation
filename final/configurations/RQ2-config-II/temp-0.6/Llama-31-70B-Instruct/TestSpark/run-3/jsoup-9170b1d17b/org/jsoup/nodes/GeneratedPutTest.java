package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attributes = new Attributes();
        Attributes result = attributes.put("key", "value"); // mocked to return new Attributes()
        Assert.assertNotNull(result);
    }

}