package ch.jalu.configme.configurationdata;

public class GeneratedTest_property_equals {

    @Test
    public void test_property_equals() {
        Property property1 = new Property("key1", "value1");
        Property property2 = new Property("key1", "value1");
        assertTrue(property1.equals(property2));
    }

}