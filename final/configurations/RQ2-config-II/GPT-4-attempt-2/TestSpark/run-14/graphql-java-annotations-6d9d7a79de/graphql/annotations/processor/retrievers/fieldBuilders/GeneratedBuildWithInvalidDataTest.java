package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildWithInvalidDataTest {

    @Test
    public void buildWithInvalidDataTest() {
        AnnotatedElement mockElement = mock(AnnotatedElement.class);
        ProcessingElementsContainer container = mock(ProcessingElementsContainer.class);
        when(container.getDirective(java.lang.reflect.Method.class)).thenThrow(new GraphQLAnnotationsException());

        new DirectivesBuilder(mockElement, container).build();
    }

}