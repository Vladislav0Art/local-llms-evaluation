package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddKeyTest {

    @Mock
    private Attributes attributes;

    @Test
    public void addKeyTest() {
        when(attributes.add("key", "value")).thenReturn(attributes);
        Assert.assertEquals(attributes, attributes.add("key", "value"));
    }

}