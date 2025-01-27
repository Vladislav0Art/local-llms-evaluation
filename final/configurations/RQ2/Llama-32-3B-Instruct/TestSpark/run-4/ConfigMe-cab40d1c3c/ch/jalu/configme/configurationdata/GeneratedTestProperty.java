package ch.jalu.configme.configurationdata;

public class GeneratedTestProperty {

    @Test
    public void testProperty() {
        Property prop = new Property("name", "value");
        assert !prop.getValue().isEmpty();
    }

}