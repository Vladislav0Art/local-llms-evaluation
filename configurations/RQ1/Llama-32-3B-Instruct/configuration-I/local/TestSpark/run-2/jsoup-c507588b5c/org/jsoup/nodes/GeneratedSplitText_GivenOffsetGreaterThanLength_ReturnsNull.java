package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;

@RunWith(PowerMockRunner.class)
public class GeneratedSplitText_GivenOffsetGreaterThanLength_ReturnsNull {

    @Test
    public void splitText_GivenOffsetGreaterThanLength_ReturnsNull() {
        String text = "Hello, World!";
        int offset = 10;
        when(TextNode.coreValue()).thenReturn(text);
        TextNode textNode = new TextNode(text);
        PowerMockito.spy(textNode).splitText(offset).should().BeNull();
    }

}