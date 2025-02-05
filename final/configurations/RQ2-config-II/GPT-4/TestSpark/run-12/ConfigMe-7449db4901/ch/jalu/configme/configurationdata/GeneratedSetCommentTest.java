package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapWithSize.aMapWithSize;
import static org.junit.Assert.assertTrue;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        cc.setComment("new_path", "New comment");
        Map<String, List<String>> allComments = cc.getAllComments();
        assertThat(allComments, aMapWithSize(1));
        assertThat(allComments, hasEntry("new_path", Collections.singletonList("New comment")));
    }

}