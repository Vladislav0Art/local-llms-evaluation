package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_key_only {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal_key_only() {
        // arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", null);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));

        // act
        builder.appendKeyVal(kv);

        // assert
        Mockito.verify(builder.q).append(Mockito.anyString());
    }

}