package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_ShouldReturnString {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void outerHtml_ShouldReturnString() {
        Document document = new Document(baseUri);
        String result = document.outerHtml();
        Mockito.verifyNoMoreInteractions(result);
    }

}