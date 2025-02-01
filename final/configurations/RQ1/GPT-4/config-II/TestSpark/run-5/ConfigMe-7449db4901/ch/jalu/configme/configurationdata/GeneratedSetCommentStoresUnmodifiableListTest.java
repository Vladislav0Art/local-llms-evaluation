package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

public class GeneratedSetCommentStoresUnmodifiableListTest {

    @Test
    public void setCommentStoresUnmodifiableListTest() {
        CommentsConfiguration config = new CommentsConfiguration();
        config.setComment("path", "comment");
        config.getAllComments().get("path").add("another comment");
    }

}