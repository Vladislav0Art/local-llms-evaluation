package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedText_SettingTextSetsInnerHtml {

    @Test
    public void text_SettingTextSetsInnerHtml() {
        String text = "New Text";
        Document document = new Document("");
        document.text(text);
        assertTrue(document.containsText(text));
    }

}