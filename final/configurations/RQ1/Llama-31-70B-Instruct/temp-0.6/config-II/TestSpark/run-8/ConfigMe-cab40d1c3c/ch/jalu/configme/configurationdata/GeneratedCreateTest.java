package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = new Property("DataSource.mysql", String.class);

        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(properties.size(), 1);
        assertEquals(properties.get(0), property);
    }

}