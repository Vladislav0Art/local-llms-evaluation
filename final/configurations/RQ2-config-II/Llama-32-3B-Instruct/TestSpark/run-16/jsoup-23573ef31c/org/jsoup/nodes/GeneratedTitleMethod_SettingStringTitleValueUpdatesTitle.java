package org.jsoup.nodes;

public class GeneratedTitleMethod_SettingStringTitleValueUpdatesTitle {

    @Test
    public void titleMethod_SettingStringTitleValueUpdatesTitle() {
        Document doc = Document.createShell("");
        doc.title("New Title");
        assertEquals("New Title", doc.title());
    }

}