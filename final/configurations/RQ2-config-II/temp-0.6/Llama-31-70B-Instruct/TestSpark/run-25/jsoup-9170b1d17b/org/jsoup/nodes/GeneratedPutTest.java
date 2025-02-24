package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Instant;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPutTest {

    @Mock
    private Attributes attributes;

    @Test
    public void putTest() {
        String key = "key";
        String value = "value";

        Attributes result = attributes.put(key, value);

        Assert.assertNotNull(result);
    }

}