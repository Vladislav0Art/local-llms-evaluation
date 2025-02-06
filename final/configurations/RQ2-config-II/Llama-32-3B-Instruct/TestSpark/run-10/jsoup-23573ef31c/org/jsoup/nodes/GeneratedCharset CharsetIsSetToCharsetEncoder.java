package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCharset CharsetIsSetToCharsetEncoder {

    @Mock
    private Connection connection;

    @Test
    public void charset

    CharsetIsSetToCharsetEncoder() {
        when(connection.charset()).thenReturn(Charset.forName("utf-8"));
        Document document = new Document();
        assertEquals(Charset.forName("utf-8"), document.charset());
    }

}