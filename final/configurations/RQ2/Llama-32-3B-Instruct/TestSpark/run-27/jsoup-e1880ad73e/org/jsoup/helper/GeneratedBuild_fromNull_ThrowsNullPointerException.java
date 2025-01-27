package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_fromNull_ThrowsNullPointerException {

    @Mock
    private Connection connection;

    @Test
    public void build_fromNull_ThrowsNullPointerException() {
        UrlBuilder builder = new UrlBuilder(null);
        assertThrows(NullPointerException.class, () -> builder.build());
    }

}