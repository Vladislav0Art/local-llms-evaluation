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
public class GeneratedDecodeUnsupportEncodingPartTest {

    @Test
    public void decodeUnsupportEncodingPartTest() throws Exception {
        assertEquals("A B C", UrlBuilder.class.getDeclaredMethod("decodePart", String.class).invoke(null, "A B C"));
    }

}