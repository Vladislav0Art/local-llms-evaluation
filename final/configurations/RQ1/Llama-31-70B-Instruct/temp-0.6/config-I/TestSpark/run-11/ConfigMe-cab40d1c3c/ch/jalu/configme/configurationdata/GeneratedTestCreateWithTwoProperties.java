package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestCreateWithTwoProperties {

    @Test
    public void testCreateWithTwoProperties() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(new Property("Data Source"));
        propertyListBuilder.add(new Property("Security"));
        Assert.assertEquals(2, propertyListBuilder.create().size());
    }

}