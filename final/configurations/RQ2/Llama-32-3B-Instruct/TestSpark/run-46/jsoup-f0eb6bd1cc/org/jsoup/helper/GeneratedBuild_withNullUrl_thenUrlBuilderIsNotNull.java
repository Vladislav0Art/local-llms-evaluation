package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_withNullUrl_thenUrlBuilderIsNotNull {

    @Mock
    private Connection connection;

    @Test
    public void build_withNullUrl_thenUrlBuilderIsNotNull() {
        UrlBuilder builder = new UrlBuilder(null);
        assertNotNull(builder);
    }

}