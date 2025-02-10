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
public class GeneratedWithoutScheme_andAuthority_thenEmptyUrlIsCreated {

    @Mock
    private Connection connection;

    @Test
    public void withoutScheme_andAuthority_thenEmptyUrlIsCreated() {
        UrlBuilder builder = new UrlBuilder(new URI("/path/to/resource").toURL());
        assertNotNull(builder.build());
    }

}