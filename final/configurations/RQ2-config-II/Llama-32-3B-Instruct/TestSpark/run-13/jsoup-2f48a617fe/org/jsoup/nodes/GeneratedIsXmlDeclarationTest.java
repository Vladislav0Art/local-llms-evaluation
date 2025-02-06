package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsXmlDeclarationTest {

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("");
        boolean result = comment.isXmlDeclaration();
        assertTrue(result);
    }

}