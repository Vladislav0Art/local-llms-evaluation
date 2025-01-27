package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.jsoup.Jsoup.connect;

public class GeneratedTitle_setAndGetTitle {

    private Connection connectionMock = Mockito.mock(Connection.class);

    @Test
    public void title_setAndGetTitle() {
        Document document = new Document();
        document.title("Example Title");
        assertEquals("Example Title", document.title());
    }

}