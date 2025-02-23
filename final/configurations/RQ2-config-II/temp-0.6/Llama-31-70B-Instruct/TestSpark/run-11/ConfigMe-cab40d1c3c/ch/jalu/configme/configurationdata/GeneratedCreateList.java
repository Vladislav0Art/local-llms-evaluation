package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateList {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createList() {
        Property<String> propertyMock = mock(Property.class);
        when(propertyMock.getPath()).thenReturn("test.path");

        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(propertyMock);

        List<Property<?>> properties = propertyListBuilder.create();

        assertEquals(1, properties.size());
        assertEquals(propertyMock, properties.get(0));
    }

}