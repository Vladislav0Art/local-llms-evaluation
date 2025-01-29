package com.force.i18n.grammar.impl;

public class GeneratedTestWriteJsonMethod {

    @Test
    public void testWriteJsonMethod() {
        GrammaticalTermMap<String, String> map = new GrammaticalTermMapImpl<>((HashMap<String, String>) it.stream().mapToObj(Map::get).collect(Collectors.toMap(Map::getKey, Map::getValue)));

        String json = map.writeJson(System.out, new RenamingProvider(), new LanguageDictionary(), Arrays.asList("term1", "term2"));

        String[] expectedLines = {"{ \"terms\": [ \"term1\" , \"term2\" ] }", "{ \"key\": \"term1\", \"value\": \"term1\" }", "{ \"key\": \"term2\", \"value\": \"term2\" }"};

        int index = 0;
        for (String line : json.split("\n")) {
            if (line.startsWith("{")) {
                index++;
            }
            System.out.println(line);
            if (index == expectedLines.length) {
                break;
            }
        }

        // check that there are no extra lines
        if (expectedLines.length != 2) {
            fail("Unexpected number of lines in JSON output");
        }
    }

}