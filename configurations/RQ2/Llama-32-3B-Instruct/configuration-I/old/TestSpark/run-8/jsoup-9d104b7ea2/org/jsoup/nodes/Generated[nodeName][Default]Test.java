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
public class Generated[nodeName][Default]

Test {

    @Mock
    private LeafNode child;

    public String text () {
        return "";
    }

    public void setText (String text){
    }

    @Test
    public void [nodeName][Default]Test() {
        when(child.nodeName()).thenReturn("child");
        assertEquals("child", nodeName());
    }

}