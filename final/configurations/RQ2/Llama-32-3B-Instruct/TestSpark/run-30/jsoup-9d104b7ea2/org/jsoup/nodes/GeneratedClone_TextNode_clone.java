package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert_NULL;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.Validate.isValid;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedClone_TextNode_clone {

    @Test
    public void clone_TextNode_clone() {
        TextNode original = new TextNode("Hello World");
        TextNode cloned = original.clone();
        assertEquals(original, cloned);
        assertNotNull(cloned);
    }

}