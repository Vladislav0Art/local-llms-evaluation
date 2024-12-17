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
public class GeneratedBuild_PathEncodedWorks {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void build_PathEncodedWorks() {
        // given
        String path = "path with special chars!";
        urlBuilder.u = new URL("http://example.com/path?query=abc#frag");

        // when
        urlBuilder.build();

        // then
        assertEquals("%20f8b0b21c", urlBuilder.u.getPath());
    }

}