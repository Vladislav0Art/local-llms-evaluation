package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GeneratedTest {

    @Test
    public void addNullPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(null);
    }

    @Test
    public void addOnePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        List<Property<?>> result = propertyListBuilder.create();

        assertThat(result.contains(mockProperty), is(true));
        assertThat(result.size(), is(1));
    }

    @Test
    public void addMultiplePropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty1 = Mockito.mock(Property.class);
        Property mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("property1.path");
        Mockito.when(mockProperty2.getPath()).thenReturn("property2.path");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
        List<Property<?>> result = propertyListBuilder.create();

        assertThat(result.contains(mockProperty1), is(true));
        assertThat(result.contains(mockProperty2), is(true));
        assertThat(result.size(), is(2));
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty1 = Mockito.mock(Property.class);
        Property mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("property.path");
        Mockito.when(mockProperty2.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
    }

    @Test
    public void createWithNoPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> result = propertyListBuilder.create();

        assertThat(result.isEmpty(), is(true));
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        assertThat(rootEntries.containsKey("property.path"), is(true));
    }

}