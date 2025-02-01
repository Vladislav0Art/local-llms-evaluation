package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedSetCommentOverridePreviousCommentTest {

    @Test
    public void setCommentOverridePreviousCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path.key", "line1");
        config.setComment("path.key", "newLine1", "newLine2");
        List<String> commentLines = config.getAllComments().get("path.key");

        Assert.assertThat(commentLines, hasSize(2));
        Assert.assertThat(commentLines.get(0), is(equalTo("newLine1")));
        Assert.assertThat(commentLines.get(1), is(equalTo("newLine2")));
    }

}