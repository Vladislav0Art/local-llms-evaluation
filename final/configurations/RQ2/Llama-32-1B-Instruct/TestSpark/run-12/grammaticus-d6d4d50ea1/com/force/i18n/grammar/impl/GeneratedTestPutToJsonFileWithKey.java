package com.force.i18n.grammar.impl;

public class GeneratedTestPutToJsonFileWithKey {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testPutToJsonFileWithKey() throws Exception {
        // Create a sample JSON file
        String json = "{\"test\": \"data\"}";

        // Put the JSON object into the file with key "key"
        testHelper.putToJsonFile(json, "key", "value");

        // Get the result from the file
        Object data = testHelper.getFromJsonFile("key.json");

        // Print the result
        System.out.println(data);
    }

}