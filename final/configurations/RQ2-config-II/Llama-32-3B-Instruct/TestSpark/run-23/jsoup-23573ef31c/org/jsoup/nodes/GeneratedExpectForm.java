package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedExpectForm {

    @Test
    public void expectForm() {
        String cssQuery = "form";
        FormElement expectedForm = mock(FormElement.class);
        Document document = new Document("");
        FormElement actualForm = document.expectForm(cssQuery);
        assertThat(actualForm, is(expectedForm));
    }

}