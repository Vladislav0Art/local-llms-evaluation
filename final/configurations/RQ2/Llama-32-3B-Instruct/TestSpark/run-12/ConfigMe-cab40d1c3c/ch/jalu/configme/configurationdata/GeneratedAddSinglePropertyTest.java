package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedAddSinglePropertyTest {

    @Test
    public void addSinglePropertyTest() {
        // Arrange & Act
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property property = new Property();
        builder.add(property);
        builder.add(new Object());

        // Assert
        assertEquals(2, builder.create().size());
    }

}