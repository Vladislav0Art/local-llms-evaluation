package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddTest_WithNullProperty_ThrowsException {

    @Test
    public void addTest_WithNullProperty_ThrowsException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(null);
    }

}