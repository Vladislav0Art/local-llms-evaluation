package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentNullPathTest {

    @Test
    public void setCommentNullPathTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment(null, "comment1");
    }

}