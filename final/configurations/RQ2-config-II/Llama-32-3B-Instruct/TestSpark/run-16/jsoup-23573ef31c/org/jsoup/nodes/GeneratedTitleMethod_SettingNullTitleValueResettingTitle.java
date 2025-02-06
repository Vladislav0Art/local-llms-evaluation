package org.jsoup.nodes;

public class GeneratedTitleMethod_SettingNullTitleValueResettingTitle {

    @Test
    public void titleMethod_SettingNullTitleValueResettingTitle() {
        Document doc = Document.createShell("");
        doc.title("Old Title");
        doc.title(null);
        assertEquals("Old Title", doc.title());
    }

}