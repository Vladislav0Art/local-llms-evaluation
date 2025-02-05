package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildDirectivesBuilderWithNullObjectTest {

    @Test
    public void buildDirectivesBuilderWithNullObjectTest() {
        // Arrange
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method method = null;
        // Act
        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        // Assert
        builder.build();
    }

}