package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import javax.annotation.Nullable;

public class GeneratedOuterHtmlSetsAttribute {

    @Test
    public void outerHtmlSetsAttribute() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        Comment comment = new Comment("attr");
        comment.outerHtml(outContent, 0, outputSettings);
        assertEquals(" attr", outContent.toString());
    }

    private static class MockOutputSettings implements Document.OutputSettings {
        @Override
        public boolean prettyPrint() {
            return true;
        }
    }

}