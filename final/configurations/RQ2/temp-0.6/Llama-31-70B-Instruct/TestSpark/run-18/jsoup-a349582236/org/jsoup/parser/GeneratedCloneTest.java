package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneTest {

    @Mock
    private Tag tag;

    @Test
    public void cloneTest() {
        try {
            when(tag.clone()).thenReturn(tag);
            assertEquals(tag, tag.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}