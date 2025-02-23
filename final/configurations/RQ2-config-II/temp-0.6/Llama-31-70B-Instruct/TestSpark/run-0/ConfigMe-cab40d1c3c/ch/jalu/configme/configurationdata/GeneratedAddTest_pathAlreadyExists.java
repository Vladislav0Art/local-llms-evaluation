package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddTest_pathAlreadyExists {

    @Test
    public void addTest_pathAlreadyExists() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);
        Property property2 = Mockito.mock(Property.class);
        Mockito.when(property2.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property2);
    }

}