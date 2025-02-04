package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

public class GeneratedGetAllCommentsEmpty {

    @Test
    public void getAllCommentsEmpty() {
        CommentsConfiguration config = new CommentsConfiguration();
        assertNull(config.getAllComments());
    }

}