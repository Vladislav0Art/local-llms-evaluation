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
public class GeneratedAppendKeyVal_notEmptyUrl {

    @Mock
    private Connection.KeyVal kv;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyVal_notEmptyUrl() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal();
        List<Connection.KeyVal> l = new ArrayList<>();
        l.add(new Connection.KeyVal());
        l.get(0).key = "abc";
        l.get(0).value = "def";

        // when
        urlBuilder.q = StringUtil.borrowBuilder();
        for (Connection.KeyVal c : l) {
            urlBuilder.appendKeyVal(c);
        }
        urlBuilder.appendKeyVal(kv);

        // then
        assert urlBuilder.q != null;
        assert urlBuilder.q.toString().equals("&abc=def&");
    }

}