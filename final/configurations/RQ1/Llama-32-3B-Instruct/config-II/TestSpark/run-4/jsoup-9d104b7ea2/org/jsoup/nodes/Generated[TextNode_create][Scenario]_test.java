package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[TextNode_create][Scenario]

_test {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public String coreValue () {
        return "test";
    }

    public String normaliseWhitespace (String text){
        return StringUtil.normaliseWhitespace(text);
    }

    @Test
    public void [TextNode_create][Scenario]_test() {
        when(parentNode).thenReturn(this);
        TextNode textNode = new TextNode(coreValue());
        assertEquals("test", textNode.text());
    }

}