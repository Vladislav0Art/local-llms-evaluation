package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetCommentForPathWithEmptyStringResultsInEmptyLineWithoutMarker {

    @Test
    public void setCommentForPathWithEmptyStringResultsInEmptyLineWithoutMarker() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {};
        String path = "path";
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList(), commentsConfiguration.getAllComments().get(path));
    }

}