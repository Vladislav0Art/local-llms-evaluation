package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsBlank_ReturnsTrue {

    private static final String TEXT = "Hello, World!";
    @Mock
    private Appendable parentElement;

    private TextNode textNode;
    private Document document;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
        textNode = new TextNode(TEXT);
        document = new Document();
        document.documentElement = document.createElement("text");
        document.appendChild(document.documentElement);
    }

    @Test
    public void isBlank_ReturnsTrue() {
        assertTrue(textNode.isBlank());
    }

}