package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_NonEmptyData_ReturnsNewCommentWithSameData {

    @Test
    public void clone_NonEmptyData_ReturnsNewCommentWithSameData() {
        Comment comment = new Comment("non-empty-data");
        Comment clonedComment = comment.clone();
        assertEquals("non-empty-data", clonedComment.getData());
    }

}