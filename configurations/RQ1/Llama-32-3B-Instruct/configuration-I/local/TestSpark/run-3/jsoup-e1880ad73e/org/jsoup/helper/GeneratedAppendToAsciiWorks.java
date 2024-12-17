package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendToAsciiWorks {

    public Connection connection = Mockito.mock(Connection.class);

    private UrlBuilder urlBuilder = new UrlBuilder(connection);

    @Test
    public void appendToAsciiWorks() throws UnsupportedEncodingException {
        // given
        String s = " example ";
        StringBuilder sb = Mockito.mock(StringBuilder.class);
        UrlBuilder.appendToAscii(s, false, sb);

        // when
        String result = sb.toString();

        // then
        assertEquals("%20e2%80%9c%20%20", result);
    }

}