package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Instant;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetTest {

    @Mock
    private Attributes attributes;

    @Test
    public void getTest() {
        String key = "key";

        String result = attributes.get(key);

        Assert.assertNull(result);
    }

}