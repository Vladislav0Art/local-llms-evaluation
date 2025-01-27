package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_NoAppendable {

    @Test
    public void outerHtmlTail_NoAppendable() {
        Appendable appendable = Mockito.mock(Appendable.class);
        Document document = new Document();
        TextNode textNode = new TextNode("");
        textNode.outerHtmlTail(appendable, 0, document.outputSettings);
        assertNull(appendable.toString());
    }

}