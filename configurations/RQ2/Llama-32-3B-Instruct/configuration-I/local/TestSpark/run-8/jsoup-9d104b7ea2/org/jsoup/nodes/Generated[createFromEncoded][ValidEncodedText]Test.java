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
public class Generated[createFromEncoded][ValidEncodedText]

Test {

    @Mock
    private LeafNode child;

    public String text () {
        return "";
    }

    public void setText (String text){
    }

    @Test
    public void [createFromEncoded][ValidEncodedText]Test() {
        when(child.createFromEncoded("hello")).thenReturn(new TextNode("hello"));
        assertEquals(new TextNode("hello"), createFromEncoded("hello"));
    }

}