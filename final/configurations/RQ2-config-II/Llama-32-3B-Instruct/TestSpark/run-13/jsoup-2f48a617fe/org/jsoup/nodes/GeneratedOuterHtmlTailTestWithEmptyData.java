package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailTestWithEmptyData {

    @Test
    public void outerHtmlTailTestWithEmptyData() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        // No data to render
    }

}