package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.Assert;

import java.util.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;

public class GeneratedCommentsConstructorWithCommentsTest {

    @Test
    public void commentsConstructorWithCommentsTest() {
        Map<String, List<String>> initialComments = new HashMap<>();
        initialComments.put("path.key", Arrays.asList("line1", "line2", "line3"));
        CommentsConfiguration config = new CommentsConfiguration(initialComments);

        Assert.assertNotNull(config.getAllComments());
        Assert.assertThat(config.getAllComments(), is(equalTo(initialComments)));
    }

}