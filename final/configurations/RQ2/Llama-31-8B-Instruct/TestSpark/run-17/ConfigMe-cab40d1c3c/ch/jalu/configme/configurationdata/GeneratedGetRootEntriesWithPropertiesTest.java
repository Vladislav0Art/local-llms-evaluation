package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesWithPropertiesTest {

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void getRootEntriesWithPropertiesTest() {
        Property<String> property1 = Mockito.mock(Property.class);
        Property<String> property2 = Mockito.mock(Property.class);
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(2, rootEntries.size());
        verify(property1).setParent(any());
        verify(property2).setParent(any());
    }

}