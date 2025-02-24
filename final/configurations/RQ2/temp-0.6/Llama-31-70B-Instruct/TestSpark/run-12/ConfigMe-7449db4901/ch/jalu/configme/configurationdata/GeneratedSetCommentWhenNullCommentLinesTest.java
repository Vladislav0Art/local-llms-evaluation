package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentWhenNullCommentLinesTest {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentWhenNullCommentLinesTest() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        String path = "path";
        String[] commentLines = null;
        commentsConfiguration.setComment(path, commentLines);
    }

}