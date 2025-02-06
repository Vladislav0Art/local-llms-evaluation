package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedForms {

    @Test
    public void forms() {
        List<FormElement> expectedForms = List.of(mock(FormElement.class), mock(FormElement.class));
        Document document = new Document("");
        List<FormElement> actualForms = document.forms();
        assertThat(actualForms, is(expectedForms));
    }

}