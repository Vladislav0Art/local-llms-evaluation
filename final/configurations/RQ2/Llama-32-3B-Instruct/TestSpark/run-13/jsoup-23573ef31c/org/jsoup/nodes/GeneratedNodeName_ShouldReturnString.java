package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNodeName_ShouldReturnString {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void nodeName_ShouldReturnString() {
        Document document = new Document(baseUri);
        String result = document.nodeName();
        Mockito.verifyNoMoreInteractions(result);
    }

}