package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHead_ThrowsIOExceptionWhenExceptionOccursDuringWritingToAccum {

    @Mock
    private Appendable accum;

    @Test
    public void outerHtmlHead_ThrowsIOExceptionWhenExceptionOccursDuringWritingToAccum() throws IOException {
        when(accum.append(anyString())).thenThrow(new IOException());
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, 0, Document.OutputSettings.DEFAULT));
    }

}