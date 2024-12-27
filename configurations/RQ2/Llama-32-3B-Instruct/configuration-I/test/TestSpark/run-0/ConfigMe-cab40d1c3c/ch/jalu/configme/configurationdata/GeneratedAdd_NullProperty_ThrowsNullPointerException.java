package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_NullProperty_ThrowsNullPointerException {

    @Mock
    private Property<?> property;

    @Test
    public void add_NullProperty_ThrowsNullPointerException() {
        // Arrange
        List<Property<?>> properties = new ArrayList<>();

        // Act and Assert
        assertThrows(NullPointerException.class, () -> PropertyListBuilder.builder(properties).add(null));
    }

}