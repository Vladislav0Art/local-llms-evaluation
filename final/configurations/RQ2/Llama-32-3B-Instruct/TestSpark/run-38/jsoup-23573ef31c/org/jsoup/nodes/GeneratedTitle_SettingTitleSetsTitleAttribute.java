package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTitle_SettingTitleSetsTitleAttribute {

    @Test
    public void title_SettingTitleSetsTitleAttribute() {
        Document document = new Document("");
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}