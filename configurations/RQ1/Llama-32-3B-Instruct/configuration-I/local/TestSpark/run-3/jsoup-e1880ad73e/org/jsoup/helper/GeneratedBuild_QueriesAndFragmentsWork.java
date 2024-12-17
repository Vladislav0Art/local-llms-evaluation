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
public class GeneratedBuild_QueriesAndFragmentsWork {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void build_QueriesAndFragmentsWork() {
        // given
        String query = "key1=value1&key2=value2";
        String fragment = "#frag";
        urlBuilder.u = new URL("http://example.com/path");
        when(connection.getRef()).thenReturn(fragment);
        urlBuilder.q = Mockito.mock(StringBuilder.class);

        // when
        urlBuilder.build();

        // then
        assertEquals("?key1=value1&key2=value2#frag", urlBuilder.u.getQuery());
    }

}