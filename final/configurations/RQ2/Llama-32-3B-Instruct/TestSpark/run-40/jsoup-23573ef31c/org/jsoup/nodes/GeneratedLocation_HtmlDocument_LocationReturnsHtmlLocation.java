package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLocation_HtmlDocument_LocationReturnsHtmlLocation {

    @Mock
    private Element element;

    @Test
    public void location_HtmlDocument_LocationReturnsHtmlLocation() {
        String html = "<html><body>Hello</body></html>";
        Document document = new Document(html);
        assertEquals(html, document.location());
    }

}