package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("<!--data-->")).thenReturn(appendable);
        comment.outerHtmlHead(appendable, 1, Mockito.mock(Document.OutputSettings.class));
        Mockito.verify(appendable).append("<!--data-->");
    }

}