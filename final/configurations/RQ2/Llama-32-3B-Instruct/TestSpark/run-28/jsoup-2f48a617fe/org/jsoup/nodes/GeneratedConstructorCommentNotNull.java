package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedConstructorCommentNotNull {

    @Test
    public void constructorCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

}