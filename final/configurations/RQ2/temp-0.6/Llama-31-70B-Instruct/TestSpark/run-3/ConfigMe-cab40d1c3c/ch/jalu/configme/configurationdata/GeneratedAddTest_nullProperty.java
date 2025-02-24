package ch.jalu.configme.configurationdata;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import ch.jalu.configme.properties.Property;

public class GeneratedAddTest_nullProperty {

    @Test
    public void addTest_nullProperty() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

}