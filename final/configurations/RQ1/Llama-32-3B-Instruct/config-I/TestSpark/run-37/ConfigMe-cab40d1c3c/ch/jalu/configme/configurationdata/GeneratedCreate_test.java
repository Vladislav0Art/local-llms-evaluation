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
public class GeneratedCreate_test {

    @Mock
    private Map<String, Object> rootEntriesMock;

    public void setup() {
        // No setup needed for this test class
    }

    @Test
    public void create_test() {
        Property<?> property1 = Mockito.mock(Property.class);
        when(property1.getPath()).thenReturn("test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);

        Property<?> property2 = Mockito.mock(Property.class);
        when(property2.getPath()).thenReturn("subtest");
        propertyListBuilder.add(property2);

        List<Property<?>> result = propertyListBuilder.create();
        assertNotNull(result);
        assertEquals(2, result.size());
    }

}