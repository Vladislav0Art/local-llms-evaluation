package org.jsoup.helper;

import org.jsoup.Connection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalizeRefTest {

    @Test
    public void normalizeRefTest() throws Exception {
        assertEquals("A%20B%20C", UrlBuilder.class.getDeclaredMethod("normalizeRef", String.class).invoke(null, "A B C"));
    }

}