package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCommentOverwritesExistingCommentLines {

    @Test
    public void setCommentOverwritesExistingCommentLines() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration(new HashMap<>());
        List<String> commentLines = Arrays.asList("oldLine1", "oldLine2");
        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        allCommentsBeforeSet.put("comment", commentLines);
        Map<String, List<String>> allCommentsAfterSet = commentsConfiguration.setComment("path", "newLine1", "newLine2").getAllComments();
        assertEquals(new ArrayList<>(Arrays.asList("newLine1", "newLine2")), allCommentsAfterSet.get("comment"));
    }

}