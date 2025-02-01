package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddExistsPropertyPathExceptionTest {

    @Test
    public void addExistsPropertyPathExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Integer> property = new TestableProperty<>("sample.property");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property); // Exception should occur here
    }

}