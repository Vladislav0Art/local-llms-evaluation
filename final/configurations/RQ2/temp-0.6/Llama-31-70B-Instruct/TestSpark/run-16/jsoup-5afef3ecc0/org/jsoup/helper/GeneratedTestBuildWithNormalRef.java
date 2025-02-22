package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestBuildWithNormalRef {

    @Mock
    private URL url;

    @Test
    public void testBuildWithNormalRef() {
        String ref = "ref";
        when(url.getRef()).thenReturn(ref);
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertEquals(ref, urlBuilder.build().getRef());
    }

}