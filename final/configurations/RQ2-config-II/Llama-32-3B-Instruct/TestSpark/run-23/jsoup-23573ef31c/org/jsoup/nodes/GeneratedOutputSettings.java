package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.List;

public class GeneratedOutputSettings {

    @Test
    public void outputSettings() {
        OutputSettings expectedOutputSettings = mock(OutputSettings.class);
        Document document = new Document("");
        OutputSettings actualOutputSettings = document.outputSettings(expectedOutputSettings);
        assertThat(actualOutputSettings, is(expectedOutputSettings));
    }

}