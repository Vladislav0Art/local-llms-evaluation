package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone {

    @Mock
    private Appendable accum;

    @Test
    public void clone() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment.getData(), cloned.getData());
    }

}