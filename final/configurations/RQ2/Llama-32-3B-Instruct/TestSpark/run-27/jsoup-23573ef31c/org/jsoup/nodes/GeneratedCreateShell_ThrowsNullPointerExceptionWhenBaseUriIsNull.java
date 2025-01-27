package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateShell_ThrowsNullPointerExceptionWhenBaseUriIsNull {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void createShell_ThrowsNullPointerExceptionWhenBaseUriIsNull() {
        Assert.assertEquals("null", Document.createShell(null).getClass());
    }

}