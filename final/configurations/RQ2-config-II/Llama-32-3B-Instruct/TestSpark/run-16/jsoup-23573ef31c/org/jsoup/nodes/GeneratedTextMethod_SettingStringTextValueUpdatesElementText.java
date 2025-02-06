package org.jsoup.nodes;

public class GeneratedTextMethod_SettingStringTextValueUpdatesElementText {

    @Test
    public void textMethod_SettingStringTextValueUpdatesElementText() {
        String html = "<p>Old Text</p>";
        Document doc = Jsoup.parse(html);
        Element element = doc.select("p").first();
        element.text("New Text");
        assertEquals("New Text", element.text());
    }

}