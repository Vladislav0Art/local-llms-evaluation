package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;

public class GeneratedSettingDataUpdatesCommentData {

    @Test
    public void SettingDataUpdatesCommentData() {
        Comment comment = new Comment("oldData");
        String oldData = comment.getData();
        comment.setData("newData");
        assertThat(comment.getData(), is("newData"));
        assertThat(oldData, is("oldData"));
    }

}