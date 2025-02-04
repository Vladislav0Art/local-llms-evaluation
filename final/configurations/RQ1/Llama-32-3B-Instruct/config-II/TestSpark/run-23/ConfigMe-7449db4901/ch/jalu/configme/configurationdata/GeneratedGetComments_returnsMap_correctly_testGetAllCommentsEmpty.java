package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;

public class GeneratedGetComments_returnsMap_correctly_testGetAllCommentsEmpty {

    @Test
    public void getComments_returnsMap_correctly_testGetAllCommentsEmpty() {
        CommentsConfiguration commentsConfig = new CommentsConfiguration();

        assertNotNull(commentsConfig.getAllComments());
    }

}