package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_CreateText {

    @Mock
    private Connection connection;

    @Mock
    private String baseUri;

    @Test
    public void text_CreateText() {
        Document document = new Document(baseUri);
        Element element = document.text("Hello World!");
        Mockito.verify(document).text(Mockito.any(String.class));
    }

}