package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToString {

    @Test
    public void toString() {
        Comment comment = new Comment("This is a comment");
        assertEquals("[MethodUnderTest][Scenario]Test", comment.toString());
    }

}