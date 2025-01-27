package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGivenAFieldWithMultipleDirectivesAndDifferentNamesWhenBuildIsCalledThenTheCorrectDirectivesShouldBeReturned {

    @Test
    public void GivenAFieldWithMultipleDirectivesAndDifferentNamesWhenBuildIsCalledThenTheCorrectDirectivesShouldBeReturned() {
        // given
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);

        // when
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        builder.addDirective(new GraphQLDirectives().directive("test").build());
        builder.addDirective(new GraphQLDirectives().directive("other").build());
        List<GraphQLArgument> arguments = Arrays.asList(new GraphQLArgument().name("argument"), new GraphQLArgument().name("other"));
        container.setArguments(arguments);

        // then
        assertEquals(2, builder.build()[0].directives.size());
    }

}