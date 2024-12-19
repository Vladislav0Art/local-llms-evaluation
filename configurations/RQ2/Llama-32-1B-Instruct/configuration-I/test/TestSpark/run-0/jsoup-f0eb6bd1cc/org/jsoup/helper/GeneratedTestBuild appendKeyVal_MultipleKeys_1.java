package org.jsoup.helper;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;

public class GeneratedTestBuild appendKeyVal_MultipleKeys_1 {

    @Test
    public void testBuild

    appendKeyVal_MultipleKeys_1() {
        final String inputUrl = "https://example.com/path?query=param";
        final UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        final String[] kv = new String[]{"key1", "key2"};
        for (String kvItem : kv) {
            urlBuilder.appendKeyVal(Mockito.mock(Connection.KeyVal.class, returnValue = kvItem));
        }
        final URL expectedOutput = Mockito.mock(URL.class);

        when(urlBuilder.build()).thenReturn(expectedOutput);
        final Url result = urlBuilder.build();
        assertEquals(expectedOutput, result);
    }

}