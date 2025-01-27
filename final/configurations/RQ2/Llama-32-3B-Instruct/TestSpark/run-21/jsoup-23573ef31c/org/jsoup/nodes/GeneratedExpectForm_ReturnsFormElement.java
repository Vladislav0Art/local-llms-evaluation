package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedExpectForm_ReturnsFormElement {

    @Mock
    private Connection connection;

    @Test
    public void expectForm_ReturnsFormElement() {
        String cssQuery = "form";
        FormElement formElement = mock(FormElement.class);
        when(connection.expectForm(cssQuery)).thenReturn(formElement);
        Document document = new Document("baseUri", connection);
        assertEquals(formElement, document.expectForm(cssQuery));
    }

}