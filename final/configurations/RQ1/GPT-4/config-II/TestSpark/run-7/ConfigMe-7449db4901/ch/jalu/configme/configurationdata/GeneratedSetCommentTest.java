package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedSetCommentTest {

    @Test
    public void setCommentTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path.key", "line1", "line2", "line3");
        List<String> commentLines = config.getAllComments().get("path.key");

        Assert.assertThat(commentLines, hasSize(3));
        Assert.assertThat(commentLines.get(0), is(equalTo("line1")));
        Assert.assertThat(commentLines.get(1), is(equalTo("line2")));
        Assert.assertThat(commentLines.get(2), is(equalTo("line3")));
    }

}