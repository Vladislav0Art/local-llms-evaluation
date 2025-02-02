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
public class GeneratedIsXmlDeclaration_returnsTrueIfDataStartsWithSlashAndQuestionMark {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void isXmlDeclaration_returnsTrueIfDataStartsWithSlashAndQuestionMark() {
        String data = "!?xml";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}