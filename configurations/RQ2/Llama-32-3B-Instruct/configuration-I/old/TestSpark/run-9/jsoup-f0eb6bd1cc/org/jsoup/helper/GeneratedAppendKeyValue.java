package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValue {

    @Mock
    private Connection.KeyVal kv;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendKeyValue() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal();
        builder.appendKeyVal(keyVal);
        Mockito.verify(builder).appendQueryValues(Mockito.anyString());
    }

}