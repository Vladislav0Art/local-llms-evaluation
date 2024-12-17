package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_ThrowsMalformedURLException {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void build_ThrowsMalformedURLException() {
        // given
        urlBuilder.u = new URL("http://example.com/invalid");
        when(connection.getHost()).thenReturn(null);

        // when and then
        assertThrows(MalformedURLException.class, () -> urlBuilder.build());
    }

}