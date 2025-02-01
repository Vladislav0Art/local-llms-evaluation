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
public class GeneratedNormalizeQueryTest {

    @Test
    public void normalizeQueryTest() throws Exception {
        assertEquals("A+B+C", UrlBuilder.class.getDeclaredMethod("normalizeQuery", String.class).invoke(null, "A B C"));
    }

}