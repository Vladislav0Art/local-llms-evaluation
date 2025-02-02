package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadShouldCallIndentIfTextIsNotEmptyAndParentIsBlockTag {

    @Mock
    private Node parentNode;

    public void setup() {
        when(parentNode.addNode(1, new TextNode("")));
    }

    @Test
    public void outerHtmlHeadShouldCallIndentIfTextIsNotEmptyAndParentIsBlockTag() throws IOException, InterruptedException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true);
        TextNode textNode = new TextNode("   ");
        when(parentNode.addNode(1, null)).thenReturn(true);
        TextNode result = textNode.splitText(7);

        outerHtmlHead(accum, 0, out);
        String html = accum.toString();
        assertTrue(html.contains("<br>"));
    }

}