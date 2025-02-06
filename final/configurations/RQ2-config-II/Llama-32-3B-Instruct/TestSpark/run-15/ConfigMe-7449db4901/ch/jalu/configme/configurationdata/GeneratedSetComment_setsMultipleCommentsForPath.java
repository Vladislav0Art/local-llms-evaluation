package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

public class GeneratedSetComment_setsMultipleCommentsForPath {

    @Test
    public void setComment_setsMultipleCommentsForPath() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();
        String path = "path1";
        String commentLine1 = "line1";
        String commentLine2 = "line2";

        Map<String, List<String>> allCommentsBeforeSet = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : commentsConfig.getAllComments().entrySet()) {
            allCommentsBeforeSet.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        CommentsConfiguration commentsConfigAfterSet = new CommentsConfiguration();
        commentsConfig.setComment(path, commentLine1, commentLine2);

        Map<String, @UnmodifiableView List<String>> allCommentsAfterSet = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : commentsConfig.getAllComments().entrySet()) {
            allCommentsAfterSet.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }

        assertEquals(2, allCommentsAfterSet.get(path).size());
    }

}