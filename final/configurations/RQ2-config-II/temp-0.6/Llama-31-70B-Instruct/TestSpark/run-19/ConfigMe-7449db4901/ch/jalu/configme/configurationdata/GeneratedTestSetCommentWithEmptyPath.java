package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestSetCommentWithEmptyPath {

    @Test
    public void testSetCommentWithEmptyPath() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("", "line1", "line2");
        Map<String, List<String>> allComments = commentsConfiguration.getAllComments();
        assert allComments.size() == 1;
        assert allComments.get("").size() == 2;
    }

}