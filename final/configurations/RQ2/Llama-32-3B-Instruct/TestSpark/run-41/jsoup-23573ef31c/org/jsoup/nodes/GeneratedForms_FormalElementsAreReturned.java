package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedForms_FormalElementsAreReturned {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void forms_FormalElementsAreReturned() {
        List<FormElement> formElements = new ArrayList<>();
        formElements.add(new FormElement());
        formElements.add(new FormElement());
        Document document = new Document("http://example.com");
        List<FormElement> result = document.forms();
        assertEquals(formElements, result);
    }

}