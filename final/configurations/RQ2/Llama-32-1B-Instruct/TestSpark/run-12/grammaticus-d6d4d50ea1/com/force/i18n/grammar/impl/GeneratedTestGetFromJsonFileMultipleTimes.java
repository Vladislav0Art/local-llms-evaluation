package com.force.i18n.grammar.impl;

public class GeneratedTestGetFromJsonFileMultipleTimes {

    private TestHelper testHelper;

    @Before
    public void setUp() {
        testHelper = new TestHelper();
    }

    @Test
    public void testGetFromJsonFileMultipleTimes() throws Exception {
        // Create a sample JSON file
        String json = "{\"test\": \"data\"}";

        // Get the JSON object from the file once
        Object data1 = testHelper.getFromJsonFile(json);

        // Put the JSON object into the file
        testHelper.putToJsonFile(json, "test2.json");

        // Get the result from the file twice
        Object data2 = testHelper.getFromJsonFile("test2.json");

        // Print the results
        System.out.println(data1);
        System.out.println(data2);
    }

}