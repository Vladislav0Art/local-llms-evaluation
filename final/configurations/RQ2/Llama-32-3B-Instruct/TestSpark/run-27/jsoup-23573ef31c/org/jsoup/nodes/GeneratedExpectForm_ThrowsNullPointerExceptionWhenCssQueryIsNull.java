package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedExpectForm_ThrowsNullPointerExceptionWhenCssQueryIsNull {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void expectForm_ThrowsNullPointerExceptionWhenCssQueryIsNull() {
        Assert.assertEquals("null", Document.createShell(BASE_URI).expectForm(null).getClass());
    }

}