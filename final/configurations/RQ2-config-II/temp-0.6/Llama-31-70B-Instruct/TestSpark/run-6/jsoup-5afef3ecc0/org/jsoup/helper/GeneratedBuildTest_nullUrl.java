package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildTest_nullUrl {

    @Test
    public void buildTest_nullUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.build();
    }

}