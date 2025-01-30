package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        Property<String> propertyMock = mock(Property.class);
        when(propertyMock.getPath()).thenReturn("existing.path");
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock);
        listBuilder.add(propertyMock);
    }

    @Test
    public void createWithRegisteredPropertiesTest() {
        Property<String> propertyMock1 = mock(Property.class);
        Property<String> propertyMock2 = mock(Property.class);
        when(propertyMock1.getPath()).thenReturn("path1");
        when(propertyMock2.getPath()).thenReturn("path2");

        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock1);
        listBuilder.add(propertyMock2);

        List<Property<?>> properties = listBuilder.create();

        Assert.assertThat(properties.size(), is(2));
        Assert.assertSame(properties.get(0), propertyMock1);
        Assert.assertSame(properties.get(1), propertyMock2);
    }

    @Test
    public void addPropertyWithNestedExistingPathTest() {
        Property<String> propertyMock1 = mock(Property.class);
        when(propertyMock1.getPath()).thenReturn("nested.path");

        Property<String> propertyMock2 = mock(Property.class);
        when(propertyMock2.getPath()).thenReturn("nested");

        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock1);
        listBuilder.add(propertyMock2);
    }

    @Test
    public void addPropertyWithConflictingExistingPathTest() {
        Property<String> propertyMock1 = mock(Property.class);
        when(propertyMock1.getPath()).thenReturn("conflicting");

        Property<String> propertyMock2 = mock(Property.class);
        when(propertyMock2.getPath()).thenReturn("conflicting.path");

        PropertyListBuilder listBuilder = new PropertyListBuilder();
        listBuilder.add(propertyMock1);
        listBuilder.add(propertyMock2);
    }

}