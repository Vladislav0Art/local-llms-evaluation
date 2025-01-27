package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedCharset_setAndGetCharset {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void charset_setAndGetCharset() {
        Document document = new Document();
        document.charset("UTF-8");
        Charset charset = document.charset();
        assertEquals(Charset.forName("UTF-8"), charset);
    }

}