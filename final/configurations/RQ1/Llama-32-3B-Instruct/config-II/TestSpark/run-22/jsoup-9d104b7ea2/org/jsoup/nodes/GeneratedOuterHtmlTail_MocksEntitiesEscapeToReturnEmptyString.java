package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_MocksEntitiesEscapeToReturnEmptyString {

    @Test
    public void outerHtmlTail_MocksEntitiesEscapeToReturnEmptyString() throws IOException {
        //given
        when(accum.append(anyString())).thenAnswer(i -> {
            String s = i.getArgumentAt(0);
            return "";
        });

        //when
        Document.OutputSettings out = new Document.OutputSettings();
        textNode.outerHtmlTail(accum, 1, out);

        //then
        verify(accum).append("");
    }

}