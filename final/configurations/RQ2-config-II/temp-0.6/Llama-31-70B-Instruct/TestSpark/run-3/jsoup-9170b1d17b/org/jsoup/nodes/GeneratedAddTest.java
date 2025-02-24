package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        Attributes attributes = new Attributes();
        Attributes result = attributes.add("key", "value"); // mocked to return new Attributes()
        Assert.assertNotNull(result);
    }

}