package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import javax.annotation.Nullable;

public class GeneratedToStingIsCorrectlySet {

    @Test
    public void toStingIsCorrectlySet() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("<!-- Data -->");
        comment.outerHtml(accum, 0, out);
        assertEquals("<!--Data-->", accum.toString());
    }

}