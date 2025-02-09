package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildWhenCalledInvokesContainerAddProcessedElementTypeTest {

    @Mock
    private ProcessingElementsContainer container;

    @Test
    public void buildWhenCalledInvokesContainerAddProcessedElementTypeTest() {
        Field field = MockField.class.getDeclaredFields()[0];
        DirectivesBuilder builder = new DirectivesBuilder(field, container);

        builder.build();

        verify(container, times(1)).addProcessedElementType(any(), any());
    }

    // Define annotation and apply it to a class to be used in tests
    @GraphQLDirectives(locations = {})
    public static class MockField {
        public String field;
    }

}