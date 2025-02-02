package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetCommentsEmpty {

    @Mock
    private CommentsConfiguration commentsConfig;

    @Test
    public void testGetCommentsEmpty() {
        when(commentsConfig.getComments()).thenReturn(java.util.Collections.emptyList());
        assertTrue(commentsConfig.getComments().isEmpty());
    }

}