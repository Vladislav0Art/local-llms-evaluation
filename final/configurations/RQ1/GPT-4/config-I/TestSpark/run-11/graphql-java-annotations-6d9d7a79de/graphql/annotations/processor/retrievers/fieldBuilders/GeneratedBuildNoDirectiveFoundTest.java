package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuildNoDirectiveFoundTest {

    @Test
    public void buildNoDirectiveFoundTest() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Annotation.class);

        Mockito.when(container.getDirectiveRegistry()).thenReturn(Map.of());
        Mockito.when(object.getDeclaredAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.build();
    }

}