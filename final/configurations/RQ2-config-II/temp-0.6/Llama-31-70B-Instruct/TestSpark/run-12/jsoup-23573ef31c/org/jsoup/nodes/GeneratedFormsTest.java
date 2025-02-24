package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        Document document = Mockito.mock(Document.class);
        Mockito.when(document.forms()).thenReturn(Mockito.mock(List.class));
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

}