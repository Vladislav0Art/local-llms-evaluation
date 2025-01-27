package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTitle_ReturnsNotNullStringWhenTitleIsSet {

    @Mock
    private Connection connectionMock;

    @Mock
    private Parser parserMock;

    @Mock
    private Element elementMock;

    public static final String BASE_URI = "https://example.com";

    public static final String CSS_QUERY = "#test";

    @Test
    public void title_ReturnsNotNullStringWhenTitleIsSet() {
        String title = "Test Title";
        Document document = new Document(BASE_URI);
        document.title(title);
        Mockito.verify(elementMock, Mockito.never()).setTitle();
        Assert.assertEquals(title, document.title());
    }

}