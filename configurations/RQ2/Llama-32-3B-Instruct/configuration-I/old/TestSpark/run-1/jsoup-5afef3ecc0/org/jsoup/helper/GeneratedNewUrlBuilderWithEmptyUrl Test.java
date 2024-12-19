package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNewUrlBuilderWithEmptyUrl Test {

    @Test
    public void newUrlBuilderWithEmptyUrl

    Test() {
        UrlBuilder builder = new UrlBuilder("");
        when(builder.build()).thenReturn(null);
    }

}