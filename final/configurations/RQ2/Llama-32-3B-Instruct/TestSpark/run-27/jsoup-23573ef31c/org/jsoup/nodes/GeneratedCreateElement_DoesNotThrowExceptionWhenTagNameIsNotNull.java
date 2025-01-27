package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_DoesNotThrowExceptionWhenTagNameIsNotNull {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void createElement_DoesNotThrowExceptionWhenTagNameIsNotNull() {
        Element element = new Document(BASE_URI).createElement("div");
        Mockito.verifyNoArguments();
    }

}