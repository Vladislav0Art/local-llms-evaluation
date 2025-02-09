package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateEmptyPropertyListTest {

    @Mock
    private Property mockProperty;

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        List<Property<?>> result = propertyListBuilder.create();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

}