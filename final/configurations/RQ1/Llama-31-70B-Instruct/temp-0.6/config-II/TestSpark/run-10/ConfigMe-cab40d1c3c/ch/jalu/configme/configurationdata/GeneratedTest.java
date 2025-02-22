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
public class GeneratedTest {

    @Mock
    private Property<?> propertyMock;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testAdd() {
        try {
            propertyListBuilder.add(propertyMock);
            assertTrue(propertyListBuilder.getRootEntries().containsValue(propertyMock));
        } catch (ConfigMeException e) {
            fail();
        }
    }

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

    @Test
    public void testAddDuplicateProperty() {
        propertyListBuilder.add(propertyMock);
        propertyListBuilder.add(propertyMock);
    }

    @Test
    public void testAddPropertyWithEmptyPath() {
        propertyMock.path = "";
        propertyListBuilder.add(propertyMock);
    }

    @Test
    public void testAddPropertyWithInvalidPath() {
        propertyMock.path = "DataSource.mysql";
        propertyListBuilder.add(propertyMock);
    }

}