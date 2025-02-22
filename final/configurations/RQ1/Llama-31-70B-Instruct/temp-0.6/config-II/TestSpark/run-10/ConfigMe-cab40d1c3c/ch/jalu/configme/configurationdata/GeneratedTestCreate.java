package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCreate {

    @Mock
    private Property<?> propertyMock;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testCreate() {
        try {
            propertyListBuilder.add(propertyMock);
            List<Property<?>> result = propertyListBuilder.create();
            assertEquals(1, result.size());
            assertEquals(propertyMock, result.get(0));
        } catch (ConfigMeException e) {
            fail();
        }
    }

}