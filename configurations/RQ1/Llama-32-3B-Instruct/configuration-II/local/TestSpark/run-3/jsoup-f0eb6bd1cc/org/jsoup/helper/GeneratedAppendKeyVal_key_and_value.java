package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_key_and_value {

    @Mock
    private Connection.KeyVal kv;

    @Test
    public void appendKeyVal_key_and_value() {
        // arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/path"));

        // act
        builder.appendKeyVal(kv);

        // assert
        Mockito.verify(builder.q).append(Mockito.anyString()).times(2);
    }

}