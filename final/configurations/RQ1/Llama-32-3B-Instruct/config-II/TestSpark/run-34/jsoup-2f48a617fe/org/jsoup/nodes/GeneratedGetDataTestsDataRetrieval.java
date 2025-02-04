package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetDataTestsDataRetrieval {

    @Test
    public void getDataTestsDataRetrieval() {
        Comment comment = new Comment("This is a test");
        assertNotNull(comment.getData());
    }

}