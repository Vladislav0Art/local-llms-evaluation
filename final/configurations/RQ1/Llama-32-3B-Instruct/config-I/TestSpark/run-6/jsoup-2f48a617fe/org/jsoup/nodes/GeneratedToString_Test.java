package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedToString_Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void toString_Test() throws IOException {
        Comment comment = new Comment("Hello World");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Document doc = Parser.htmlParser().settings(ParseSettings.preserveCase).parseInput("<html><body>Hello World</body></html>", "");
        Element el = doc.body().child(0);
        documentBuilder.setDocument(doc);
        elementBuilder.clearChildren(el);
        comment.outerHtml(bos, out);
        assertTrue(bos.toString().contains("<!--Hello World-->"));
    }

}