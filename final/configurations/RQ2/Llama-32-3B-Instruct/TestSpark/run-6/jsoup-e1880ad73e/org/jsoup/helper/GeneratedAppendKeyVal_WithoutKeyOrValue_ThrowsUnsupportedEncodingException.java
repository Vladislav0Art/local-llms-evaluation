package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendKeyVal_WithoutKeyOrValue_ThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_WithoutKeyOrValue_ThrowsUnsupportedEncodingException() {
        try {
            new UrlBuilder(null).appendKeyVal(Connection.KeyVal.of(1, 2));
            assert false;
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

}