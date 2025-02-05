package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GeneratedAddMultiplePropertiesTest {

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

}