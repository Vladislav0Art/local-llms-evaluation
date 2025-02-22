package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetCommentTest {

    @Mock
    private CommentsConfiguration commentsConfiguration;

    @Test
    public void setCommentTest() {
        when(commentsConfiguration.setComment(Mockito.anyString(), Mockito.anyString())).thenReturn(null);
    }

}