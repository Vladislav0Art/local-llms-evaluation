package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import java.lang.reflect.Method;

public class GeneratedBuildWhenExceptionThrownTest {

    @Test
    public void buildWhenExceptionThrownTest() {
        // Arrange
        Method mockAnnotatedMethod = mock(Method.class);
        when(mockAnnotatedMethod.getAnnotations()).thenThrow(new NullPointerException());
        ProcessingElementsContainer mockContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder testInstance = new DirectivesBuilder(mockAnnotatedMethod, mockContainer);

        // Act
        testInstance.build();
    }

}