package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.jetbrains.annotations.UnmodifiableView;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetAllCommentsImmutableMapTest {

    @Test
    public void getAllCommentsImmutableMapTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String[] comments = {"comment1", "comment2"};

        commentsConfiguration.setComment("key", comments);

        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        allComments.put("illegalKey", Arrays.asList("illegalValue"));
    }

}