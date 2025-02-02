package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAsXmlDeclaration_returnsValidDeclaration {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void asXmlDeclaration_returnsValidDeclaration() throws Exception {
        String data = "This is an XML declaration";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.isXmlDeclaration());
    }

}