package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.net.URL;

import org.jsoup.Connection.KeyVal;
import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.DataUtil;

public class GeneratedBuildThrowsNullPointerExceptionWhenInputUrlIsNull {

    @Test
    public void buildThrowsNullPointerExceptionWhenInputUrlIsNull() {
        assertNull(new UrlBuilder(null).build());
    }

}