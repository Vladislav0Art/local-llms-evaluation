package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        Comment comment = new Comment("test");
        assertNotNull(comment);
        assertEquals("Comment", comment.nodeName());
        assertEquals("test", comment.getData());
    }

}