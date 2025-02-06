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

public class GeneratedClone_newComment {

    @Test
    public void clone_newComment() {
        // [MethodUnderTest][NewComment]Test
        Comment originalComment = new Comment("Some Data");
        Comment clonedComment = originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment.nodeName(), clonedComment.nodeName());
    }

}