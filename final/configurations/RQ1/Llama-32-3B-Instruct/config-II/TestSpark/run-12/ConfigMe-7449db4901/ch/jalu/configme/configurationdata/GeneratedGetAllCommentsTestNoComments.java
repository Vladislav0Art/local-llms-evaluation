package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetAllCommentsTestNoComments {

    @Test
    public void getAllCommentsTestNoComments() {
        CommentsConfiguration commentsConfiguration = new CommentsConfiguration();
        assertEquals(0, commentsConfiguration.getComments().size());
    }

}