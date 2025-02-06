package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedExpectForm FormIsFoundByCssQuery {

    @Mock
    private Connection connection;

    @Test
    public void expectForm

    FormIsFoundByCssQuery() {
        when(connection.selectFirst(".test")).thenReturn(new FormElement("test"));
        Document document = Document.createShell("http://example.com");
        assertEquals("test", document.expectForm(".test").tagName());
    }

}