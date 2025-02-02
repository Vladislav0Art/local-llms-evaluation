package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void asXmlDeclaration() {
        Comment comment = new Comment("data");

        XmlDeclaration expectedDeclarion = null;
        when(comment.getData()).thenReturn("data");
        when(accum.append(anyString())).thenReturn(accum);

        assertEquals(expectedDeclarion, comment.asXmlDeclaration());
    }

}