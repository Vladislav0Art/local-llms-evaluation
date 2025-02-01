package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class GeneratedSetCommentOverridePreviousValueTest {

    @Test
    public void setCommentOverridePreviousValueTest() {
        CommentsConfiguration cc = new CommentsConfiguration();
        cc.setComment("path1", "Old Comment");
        cc.setComment("path1", "New Comment");
        Map<String, List<String>> comments = cc.getAllComments();

        assertThat(comments.get("path1").size(), is(1));
        assertThat(comments.get("path1").get(0), is("New Comment"));
    }

}