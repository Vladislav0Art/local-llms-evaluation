package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfTest {

    @Mock
    private Tag tag;

    @Test
    public void valueOfTest() {
        when(tag.valueOf("div")).thenReturn(tag);
        Assert.assertEquals(tag, tag.valueOf("div"));
    }

}