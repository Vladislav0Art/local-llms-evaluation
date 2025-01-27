package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateElement_CreateElement {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void createElement_CreateElement() {
        Document document = new Document(baseUri);
        Element element = document.createElement("div");
        Mockito.verify(document).createElement(Mockito.any(String.class));
    }

}