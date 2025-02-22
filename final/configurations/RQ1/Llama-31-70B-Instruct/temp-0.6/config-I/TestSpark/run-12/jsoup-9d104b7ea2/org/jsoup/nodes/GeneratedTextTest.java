package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.internal.StringUtil;
import org.jsoup.internal.Entities;
import org.jsoup.internal.Normalizer;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode(" Test ");
        assertEquals("Test", textNode.text());
    }

}