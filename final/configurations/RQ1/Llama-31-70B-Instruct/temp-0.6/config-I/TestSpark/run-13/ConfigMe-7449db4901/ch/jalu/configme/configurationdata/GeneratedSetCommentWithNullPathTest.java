package ch.jalu.configme.configurationdata;

import static org.mockito.Mockito.when;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.CommentsConfiguration;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetCommentWithNullPathTest {

    private CommentsConfiguration configuration;

    @Test
    public void setCommentWithNullPathTest() {
        configuration = new CommentsConfiguration();
        String path = null;
        String[] commentLines = new String[]{"comment1", "comment2"};
        configuration.setComment(path, commentLines);
        List<String> actualComments = configuration.getAllComments().get(path);
        Assert.assertEquals(Arrays.asList(commentLines), actualComments);
    }

}