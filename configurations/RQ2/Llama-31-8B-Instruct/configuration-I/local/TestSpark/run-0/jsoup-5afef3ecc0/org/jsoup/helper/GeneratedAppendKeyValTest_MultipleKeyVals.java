package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyValTest_MultipleKeyVals {

    @Test
    public void appendKeyValTest_MultipleKeyVals() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder("https://example.com");
        KeyVal keyVal1 = new KeyVal("key1", "value1");
        KeyVal keyVal2 = new KeyVal("key2", "value2");
        urlBuilder.appendKeyVal(keyVal1);
        urlBuilder.appendKeyVal(keyVal2);
        verify(urlBuilder).appendKeyVal(keyVal1);
        verify(urlBuilder).appendKeyVal(keyVal2);
    }

}