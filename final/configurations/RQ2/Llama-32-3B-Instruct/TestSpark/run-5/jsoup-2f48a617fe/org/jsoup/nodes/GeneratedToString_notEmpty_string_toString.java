package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.Document.OutputSettings.LAX;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_notEmpty_string_toString {

    @Mock
    private Appendable accum;

    @Mock
    private DocumentOutputSettings out;

    @Test
    public void toString_notEmpty_string_toString() {
        Comment comment = new Comment("Hello");
        assertEquals("Hello", comment.toString());
    }

}