package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.*;

public class GeneratedTestForms {

    private Document document = new Document("");

    @Test
    public void testForms() {
        List<FormElement> forms = new ArrayList<>();
        when(document.forms()).thenReturn(forms);
        Elements result = document.forms();
        assertEquals(1, result.size());
        Element element = result.get(0);
        verify(element).expectForm("form-id");
    }

}