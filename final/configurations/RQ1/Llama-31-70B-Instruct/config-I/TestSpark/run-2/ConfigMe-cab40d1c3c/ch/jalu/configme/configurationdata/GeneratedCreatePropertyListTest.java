package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreatePropertyListTest {

    @Mock
    private Property<?> mockProperty;

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        when(mockProperty.getPath()).thenReturn("test.path");
        propertyListBuilder.add(mockProperty);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertNotNull(propertyList);
        assertEquals(1, propertyList.size());
    }

}