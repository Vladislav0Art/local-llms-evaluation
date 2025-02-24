package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.Instant;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIndexOfKeyTest {

    @Mock
    private Attributes attributes;

    @Test
    public void indexOfKeyTest() {
        String key = "key";

        int index = attributes.indexOfKey(key);

        Assert.assertEquals(0, index);
    }

}