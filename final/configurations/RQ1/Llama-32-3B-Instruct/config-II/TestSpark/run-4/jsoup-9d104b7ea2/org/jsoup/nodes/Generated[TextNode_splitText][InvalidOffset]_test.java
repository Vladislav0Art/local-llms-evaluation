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
public class Generated[TextNode_splitText][InvalidOffset]

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
    public void [TextNode_splitText][InvalidOffset]_test() {
        when(parentNode).thenReturn(this);
        TextNode textNode = new TextNode(coreValue());
        int offset = -1;
        try {
            textNode.splitText(offset);
            fail("Expected IOException");
        } catch (IOException e) {

        }
    }

}