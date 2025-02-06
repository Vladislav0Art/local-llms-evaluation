package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration {

    @Mock
    private Appendable accum;

    @Test
    public void isXmlDeclaration() {
        when(accum instanceof Applicable).thenReturn(true);
        Comment comment = new Comment("data");
        assertTrue(comment.isXmlDeclaration());
    }

}