package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_returnsOuterHtml {

    @Mock
    private Appendable accum;

    @Test
    public void toString_returnsOuterHtml() {
        String data = "Hello";
        Comment comment = new Comment(data);
        assertEquals("#comment" + "\n<!--" + data + "-->", comment.toString());
    }

}