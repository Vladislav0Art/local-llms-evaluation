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

public class GeneratedSetCommentWithMultipleLinesTest {

    @Test
    public void setCommentWithMultipleLinesTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        cc.setComment("new_path", "First comment", "Second comment");
        Map<String, List<String>> allComments = cc.getAllComments();
        assertThat(allComments, aMapWithSize(1));
        assertThat(allComments, hasEntry("new_path", Arrays.asList("First comment", "Second comment")));
    }

}