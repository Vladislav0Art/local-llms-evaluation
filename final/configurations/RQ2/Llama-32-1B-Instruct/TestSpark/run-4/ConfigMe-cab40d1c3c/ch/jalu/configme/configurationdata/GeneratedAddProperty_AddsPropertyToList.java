package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedAddProperty_AddsPropertyToList {

    @BeforeEach
    public void setup() {
        this.propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_AddsPropertyToList() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property = this.propertyListBuilder.addProperty("testProperty");
        assertTrue(properties.contains(property));
    }

}