package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.junit.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedIsBlank_method_returnsFalse_ifTextContentPresent {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    // TextNode constructor tests

    @Test
    public void isBlank_method_returnsFalse_ifTextContentPresent() {
        when(parentNode.getWholeText()).thenReturn("present text");
        TextNode textNode = new TextNode("");
        textNode.coreValue = "present text";
        assertFalse(textNode.isBlank());
    }

}