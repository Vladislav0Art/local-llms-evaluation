package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCommentsConfiguration_getAllComments_ReturnsEmptyListWhenNoEntries {

    @Mock
    private Map<String, List<String>> commentsMap;

    @Test
    public void testCommentsConfiguration_getAllComments_ReturnsEmptyListWhenNoEntries() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        Map<String, @UnmodifiableView List<String>> allComments = commentsConfiguration.getAllComments();
        assertEquals(0, allComments.size());
    }

}