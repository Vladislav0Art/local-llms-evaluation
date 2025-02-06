package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTestWithEmptyData {

    @Test
    public void outerHtmlHeadTestWithEmptyData() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        // No data to render
    }

}