package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.Coercing;
import graphql.annotations.annotationTypes.directives.activation.Directive;
import graphql.annotations.annotationTypes.directives.activation.DirectiveArgument;
import graphql.annotations.annotationTypes.directives.activation.DirectiveLocation;
import graphql.annotations.annotationTypes.directives.activation.DirectiveLocations;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

public class GeneratedBuildNameNotInRegistryTest {

    @Test
    public void buildNameNotInRegistryTest() {
        Method mockedElement = mock(Method.class);
        ProcessingElementsContainer mockedContainer = mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(mockedElement, mockedContainer);

        Directive directiveAnnotation = mock(Directive.class);

        when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockedElement)).thenReturn(Arrays.asList(directiveAnnotation));
        when(directiveAnnotation.name()).thenReturn("mockedName");
        when(mockedContainer.getDirectiveRegistry().containsKey("mockedName")).thenReturn(false);

        builder.build();
    }

}