package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_emptyUrl {

    @Mock
    private Connection.KeyVal kv;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyVal_emptyUrl() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal();

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assert urlBuilder.q != null;
        assert urlBuilder.q.toString().equals("");
    }

}