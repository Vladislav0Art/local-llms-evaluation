package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntriesWithPropertiesTest {

    @InjectMocks
    private PropertyListBuilder builder;

    @Test
    public void getRootEntriesWithPropertiesTest() {
        Property<String> property1 = mock(Property.class, Mockito.CALLS_REAL_METHODS);
        Property<String> property2 = mock(Property.class, Mockito.CALLS_REAL_METHODS);
        builder.add(property1);
        builder.add(property2);
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertNotNull(rootEntries);
        assertEquals(2, rootEntries.size());
        verify(property1).setParent(builder);
        verify(property2).setParent(builder);
    }

}