package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

import org.mockito.Mockito;
import org.jsoup.parser.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCreateComment_WithEmptyData_ReturnsEmptyComment {

    @Test
    public void createComment_WithEmptyData_ReturnsEmptyComment() {
        // Given
        String data = "";

        // When
        Comment comment = new Comment(data);

        // Then
        assertNotNull(comment);
        assertTrue(comment.getData().isEmpty());
        assertEquals("#comment", comment.nodeName());
    }

}