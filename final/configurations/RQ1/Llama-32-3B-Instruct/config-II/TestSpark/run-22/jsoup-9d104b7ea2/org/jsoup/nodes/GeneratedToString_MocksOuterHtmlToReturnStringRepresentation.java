package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedToString_MocksOuterHtmlToReturnStringRepresentation {

    @Test
    public void toString_MocksOuterHtmlToReturnStringRepresentation() throws IOException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return s.equals("Hello World");
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtml(out);

        //then
        verify(accum).append("Hello World");
    }

}