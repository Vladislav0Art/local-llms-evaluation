package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationTest {

    @Mock
    private Comment comment;

    @Test
    public void isXmlDeclarationTest() {
        comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

}