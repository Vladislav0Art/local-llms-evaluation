package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_setsCommentForPath {

    @Test
    public void setComment_setsCommentForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path1";
        String commentLine = "line1";

        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : commentsConfig.getAllComments().entrySet()) {
            allCommentsBeforeSet.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        CommentsConfiguration commentsConfigAfterSet = new CommentsConfiguration();
        commentsConfig.setComment(path, commentLine);

        Map<String, @UnmodifiableView List<String>> allCommentsAfterSet = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : commentsConfig.getAllComments().entrySet()) {
            allCommentsAfterSet.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        assertNotEquals(allCommentsBeforeSet, allCommentsAfterSet);
        assertEquals(1, allCommentsAfterSet.size());
    }

}