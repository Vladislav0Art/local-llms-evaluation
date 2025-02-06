package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationReturnsFalse {

    @Mock
    private LeafNode leafNodeMock;

    @InjectMocks
    private Comment commentObject;

    @Test
    public void isXmlDeclarationReturnsFalse() {
        when(leafNodeMock.isXmlDeclaration()).thenReturn(false);
        boolean result = commentObject.isXmlDeclaration();
        assertFalse(result);
    }

}