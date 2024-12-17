package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Test;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class Generated[splitText][SplitAtOffsetAndNewLine]

Test {

    @Mock
    private LeafNode child;

    public String text () {
        return "";
    }

    public void setText (String text){
    }

    @Test
    public void [splitText][SplitAtOffsetAndNewLine]Test() {
        when(text()).thenReturn("h\nello");
        TextNode result1 = splitText(0);
        assertEquals("", text(result1));
        TextNode result2 = splitText(5);
        assertEquals("ello", text(result2));
    }

}