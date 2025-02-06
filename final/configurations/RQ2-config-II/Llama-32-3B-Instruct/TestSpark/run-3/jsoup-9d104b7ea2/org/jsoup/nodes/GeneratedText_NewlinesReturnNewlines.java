package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedText_NewlinesReturnNewlines {

    @Test
    public void text_NewlinesReturnNewlines() {
        TextNode node = new TextNode("\n");
        assertEquals("\n", node.text());
    }

}