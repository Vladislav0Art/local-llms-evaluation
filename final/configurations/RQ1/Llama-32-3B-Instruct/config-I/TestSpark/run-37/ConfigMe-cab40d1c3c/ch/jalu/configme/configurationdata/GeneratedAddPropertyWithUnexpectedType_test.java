package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyWithUnexpectedType_test {

    @Mock
    private Map<String, Object> rootEntriesMock;

    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void addPropertyWithUnexpectedType_test() {
        Property<?> property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", 123);
        when(rootEntriesMock).get("key").thenReturn(map);
        try {
            PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
            propertyListBuilder.add(property);
            fail("Expected ConfigMeException to be thrown.");
        } catch (ConfigMeException e) {
            assertEquals("Value of unknown type found at '" + "test" + "': 123", e.getMessage());
        }
    }

}