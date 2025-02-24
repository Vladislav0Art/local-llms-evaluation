package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPutEmptyKeyTest {

    @Mock
    private Attributes attributes;

    @Test
    public void putEmptyKeyTest() {
        when(attributes.put("", "")).thenReturn(attributes);
        Assert.assertEquals(attributes, attributes.put("", ""));
    }

}