package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.SpyBean;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedClone_ReturnsSameTextNode {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @SpyBean
    private LeafNode leafNode;

    public static void main(String[] args) {
        org.mockito.MockitoAnnotations.initMocks(GeneratedTest.class);
    }

    @Test
    public void clone_ReturnsSameTextNode() {
        TextNode original = new TextNode("");
        TextNode result = original.clone();
        assertTrue(result.equals(original));
    }

}