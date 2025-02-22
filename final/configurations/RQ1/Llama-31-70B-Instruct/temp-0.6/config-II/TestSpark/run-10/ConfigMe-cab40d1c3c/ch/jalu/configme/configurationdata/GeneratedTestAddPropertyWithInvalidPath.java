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
public class GeneratedTestAddPropertyWithInvalidPath {

    @Mock
    private Property<?> propertyMock;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testAddPropertyWithInvalidPath() {
        propertyMock.path = "DataSource.mysql";
        propertyListBuilder.add(propertyMock);
    }

}