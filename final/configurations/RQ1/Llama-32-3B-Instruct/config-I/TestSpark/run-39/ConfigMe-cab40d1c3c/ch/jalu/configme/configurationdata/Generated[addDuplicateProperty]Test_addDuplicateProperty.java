package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class Generated[addDuplicateProperty]

Test_addDuplicateProperty {

    @Mock
    private Map<String, Object> rootEntries;

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder(rootEntries);

    @Test
    public void [addDuplicateProperty]Test_addDuplicateProperty() {
        Property<?> property = new Property<>("DataSource.mysql", "value");
        try {
            propertyListBuilder.add(property);
            fail("Expected ConfigMeException not thrown");
        } catch (ConfigMeException e) {
            assertEquals("Path at '" + property.getPath() + "' already exists", e.getMessage());
        }
    }

}