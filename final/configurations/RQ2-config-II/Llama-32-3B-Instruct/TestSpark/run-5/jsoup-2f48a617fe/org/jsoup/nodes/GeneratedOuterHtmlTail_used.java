package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Comment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.mockito.Mockito;

public class GeneratedOuterHtmlTail_used {

    @Test
    public void outerHtmlTail_used() {
        // [MethodUnderTest][Used]Test
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Comment comment = new Comment("Some Data");
        comment.outerHtmlTail(accum, 0, out);
        assertNotNull(accum.toString());
    }

}