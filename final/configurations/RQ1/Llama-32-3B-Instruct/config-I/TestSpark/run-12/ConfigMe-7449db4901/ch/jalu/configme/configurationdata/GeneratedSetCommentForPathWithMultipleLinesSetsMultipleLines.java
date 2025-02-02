package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSetCommentForPathWithMultipleLinesSetsMultipleLines {

    @Test
    public void setCommentForPathWithMultipleLinesSetsMultipleLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] commentLines = {"line1\nline2", "line3\n"};
        String path = "path";
        commentsConfiguration.setComment(path, commentLines);
        assertEquals(Arrays.asList("line1\nline2", "line3\n"), commentsConfiguration.getAllComments().get(path));
    }

}