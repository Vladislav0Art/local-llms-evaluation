package org.jsoup.nodes;

public class GeneratedTestParseSettings {

    @Before
    public void setup() {
        Jsoup.parse(System.getProperty("user.dir"));
    }

    @Test
    public void testParseSettings() throws Exception {
        ParseSettings parseSettings = new ParseSettings(true, true);
        System.out.println(parseSettings.toString());
    }

}