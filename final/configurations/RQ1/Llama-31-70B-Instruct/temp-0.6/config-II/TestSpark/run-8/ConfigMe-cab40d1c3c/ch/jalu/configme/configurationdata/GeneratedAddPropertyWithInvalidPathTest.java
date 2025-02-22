package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedAddPropertyWithInvalidPathTest {

    @Test
    public void addPropertyWithInvalidPathTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = new Property("DataSource.mysql", String.class);

        propertyListBuilder.add(property);

        Property anotherProperty = new Property("DataSource", String.class);
        propertyListBuilder.add(anotherProperty);
    }

}