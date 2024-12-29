package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        TextNode tn = new TextNode("test");
        TextNode clone = tn.clone();
        assertFalse(tn == clone);
        assertEquals(tn.text(), clone.text());
    }

}