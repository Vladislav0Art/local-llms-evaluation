package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[TextNode_SplitText][Failure]

Test {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Appendable accum;

    private TextNode textNode;

    @Before
    public void setup () {
        textNode = new TextNode("Hello World");
    }

    public static String normaliseWhitespace (String text){
        return StringUtil.normaliseWhitespace(text);
    }

    public static String stripLeadingWhitespace (String text){
        return text.replaceFirst("^\\s+", "");
    }

    public static boolean lastCharIsWhitespace (StringBuilder sb){
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    @Test
    public void [TextNode_SplitText][Failure]Test() {
        TextNode textNode = new TextNode("");
        assertNull(textNode.splitText(-1));
    }

}