package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclaration_ReturnsFalse {

    @Mock
    private Appendable accum;

    @Test
    public void isXmlDeclaration_ReturnsFalse() {
        assertFalse(comment.isXmlDeclaration());
    }

}