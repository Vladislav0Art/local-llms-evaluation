package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_url_with_relative_path {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void build_url_with_relative_path() {
        // arrange
        URL u = new URL("http://example.com/path?query=value#anchor");
        UrlBuilder builder = new UrlBuilder(u);

        builder.u.setPath("");
        builder.build();

        // assert
        Mockito.verify(builder.u).getHost();
        Mockito.verify(builder.q);
    }

}