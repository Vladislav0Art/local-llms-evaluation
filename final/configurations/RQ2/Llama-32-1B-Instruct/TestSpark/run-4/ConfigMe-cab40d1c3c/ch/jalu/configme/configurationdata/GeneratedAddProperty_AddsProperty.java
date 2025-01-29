package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedAddProperty_AddsProperty {

    private PropertyListBuilder propertyListBuilder;

    @BeforeEach
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_AddsProperty() {
        assertTrue(propertyListBuilder.add("testProperty").hasValueOfType(Property.class));
    }

}