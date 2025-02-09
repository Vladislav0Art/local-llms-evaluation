package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailShouldNotThrowAnyExceptions {

    @Mock
    private String data;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlTailShouldNotThrowAnyExceptions() throws IOException {
        Comment comment = new Comment(data);
        appendableMock();
        documentOutputSettingsMock();
        String expectedOutput = "expected html";
        Mockito.when(accum.append(Mockito.anyString())).thenReturn(expectedOutput);
        comment.outerHtmlHead(accum, 1, out);
        comment.outerHtmlTail(accum, 2, out);
    }

}