package com.force.i18n.grammar.impl;

public class GeneratedTestPutToJsonFileMultipleTimes {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testPutToJsonFileMultipleTimes() throws Exception {
        // Create a sample JSON file
        String json = "{\"test\": \"data\"}";

        // Put the JSON object into the file once
        testHelper.putToJsonFile(json, "test2.json");

        // Get the result from the file twice
        Object data2 = testHelper.getFromJsonFile("test2.json");

        // Print the results
        System.out.println(data1);
    }

}