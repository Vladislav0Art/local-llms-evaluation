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
public class GeneratedCreateInvalidPath_test {

    @Mock
    private Map<String, Object> rootEntriesMock;

    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void createInvalidPath_test() {
        Property<?> property = Mockito.mock(Property.class);
        when(property.getPath()).thenReturn("test");
        try {
            PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
            propertyListBuilder.add(property);
            fail("Expected ConfigMeException to be thrown.");
        } catch (ConfigMeException e) {
            assertEquals("Path at '" + property.getPath() + "' already exists", e.getMessage());
        }
    }

}