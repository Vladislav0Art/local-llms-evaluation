package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedSetCommentReplacesExistingLinesTest {

    @Test
    public void setCommentReplacesExistingLinesTest() {
        String path = "myPath";
        Map<String, List<String>> comments = new HashMap<>();
        comments.put(path, Arrays.asList("oldLine1", "oldLine2"));
        CommentsConfiguration configuration = new CommentsConfiguration(comments);

        String[] newCommentLines = new String[]{"newLine1", "newLine2"};
        configuration.setComment(path, newCommentLines);

        Map<String, List<String>> allComments = configuration.getAllComments();
        assertEquals(1, allComments.size());
        assertTrue(allComments.containsKey(path));
        assertEquals(Arrays.asList(newCommentLines), allComments.get(path));
    }

}