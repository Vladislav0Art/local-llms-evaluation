package org.jsoup.nodes;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.jsoup.Jsoup.connect;

public class GeneratedCharset_SetAndGetCharset {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void charset_SetAndGetCharset() {
        Document document = new Document();
        document.charset("UTF-8");
        Charset charset = document.charset();
        assertEquals(Charset.forName("UTF-8"), charset);
    }

}