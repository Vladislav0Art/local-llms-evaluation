package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.net.URL;

@RunWith(PowerMockRunner.class)
public class GeneratedAppendKeyValWithValidKeyVal {

    @Test
    public void appendKeyValWithValidKeyVal() {
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("key");
        kv.setValue("value");
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(kv);
        // assertion logic here
    }

}