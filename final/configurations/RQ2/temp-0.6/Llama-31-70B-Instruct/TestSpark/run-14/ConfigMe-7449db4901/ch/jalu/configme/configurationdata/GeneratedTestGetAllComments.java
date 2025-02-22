package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestGetAllComments {

    private CommentsConfiguration commentsConfiguration;

    @Test
    public void testGetAllComments() {
        commentsConfiguration = new CommentsConfiguration();
        assertEquals(commentsConfiguration.getAllComments().size(), 0);
    }

}