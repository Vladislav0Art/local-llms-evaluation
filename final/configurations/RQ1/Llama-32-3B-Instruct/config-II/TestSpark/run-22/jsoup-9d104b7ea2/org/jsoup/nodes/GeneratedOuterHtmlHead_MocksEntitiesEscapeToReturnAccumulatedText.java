package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_MocksEntitiesEscapeToReturnAccumulatedText {

    @Test
    public void outerHtmlHead_MocksEntitiesEscapeToReturnAccumulatedText() throws IOException, InterruptedException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return s.equals(textNode.text());
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlHead(accum, 1, out);

        //then
        verify(accum).append("Hello World");
    }

}