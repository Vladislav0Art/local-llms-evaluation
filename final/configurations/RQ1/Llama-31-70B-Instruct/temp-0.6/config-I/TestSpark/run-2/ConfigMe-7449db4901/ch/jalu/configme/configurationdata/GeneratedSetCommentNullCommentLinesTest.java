package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedSetCommentNullCommentLinesTest {

    @Test
    public void setCommentNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        commentsConfiguration.setComment("path1", (String[]) null);
    }

}