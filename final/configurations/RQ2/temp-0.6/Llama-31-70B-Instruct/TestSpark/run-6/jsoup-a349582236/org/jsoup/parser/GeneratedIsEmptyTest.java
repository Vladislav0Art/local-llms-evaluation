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
public class GeneratedIsEmptyTest {

    @Mock
    private Tag tag;

    @Test
    public void isEmptyTest() {
        when(tag.isEmpty()).thenReturn(true);
        Assert.assertTrue(tag.isEmpty());
    }

}