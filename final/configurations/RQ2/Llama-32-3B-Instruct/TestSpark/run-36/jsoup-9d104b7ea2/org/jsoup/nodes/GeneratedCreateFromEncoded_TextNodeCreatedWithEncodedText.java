package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateFromEncoded_TextNodeCreatedWithEncodedText {

    @Mock
    private LeafNode mockLeafNode;

    @Test
    public void createFromEncoded_TextNodeCreatedWithEncodedText() {
        when(mockLeafNode.text()).thenReturn("encoded text");
        assertEquals("encoded text", TextNode.createFromEncoded("encoded text"));
    }

}