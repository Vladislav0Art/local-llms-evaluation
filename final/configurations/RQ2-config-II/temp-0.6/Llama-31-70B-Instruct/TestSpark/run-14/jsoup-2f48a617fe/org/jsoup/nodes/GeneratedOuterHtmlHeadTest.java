package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Mock
    private XmlDeclaration xmlDeclaration;

    @InjectMocks
    private Comment comment;

    @Test
    public void outerHtmlHeadTest() throws IOException {
        String expected = "expected";
        Appendable appendable = mock(Appendable.class);
        when(appendable.append(expected)).thenReturn(appendable);
        comment.outerHtmlHead(appendable, 0, new Document.OutputSettings());
        verify(appendable).append(expected);
    }

}