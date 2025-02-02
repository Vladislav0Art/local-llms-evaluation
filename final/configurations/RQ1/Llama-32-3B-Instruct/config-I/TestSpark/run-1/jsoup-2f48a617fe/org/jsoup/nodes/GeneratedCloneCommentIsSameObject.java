package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedCloneCommentIsSameObject {

    @Test
    public void cloneCommentIsSameObject() {
        Comment comment1 = new Comment("Data");
        Comment comment2 = comment1.clone();
        assertSame(comment1, comment2);
    }

}