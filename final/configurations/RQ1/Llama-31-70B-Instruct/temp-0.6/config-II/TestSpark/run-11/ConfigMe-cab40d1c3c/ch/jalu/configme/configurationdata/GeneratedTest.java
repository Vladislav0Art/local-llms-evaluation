package ch.jalu.configme.configurationdata;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_propertyAlreadyExists_throwsException() {
        // arrange
        String path = "DataSource.mysql";
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn(path);
        propertyListBuilder.add(property);

        // act
        propertyListBuilder.add(property);
    }

    @Test
    public void addProperty_pathEndsWithProperty_throwsException() {
        // arrange
        String path = "DataSource.mysql";
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn(path);
        propertyListBuilder.add(property);

        property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql.property");

        // act
        propertyListBuilder.add(property);
    }

    @Test
    public void create_noPropertiesAdded_returnsEmptyList() {
        // act
        List<Property<?>> properties = propertyListBuilder.create();

        // assert
        assertTrue(properties.isEmpty());
    }

}