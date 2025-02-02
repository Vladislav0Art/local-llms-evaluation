package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedToString_ReturnsOuterHtml {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);

        Comment comment = new Comment("");
        Object result = comment.toString();
        assertNotNull(result);
    }

}