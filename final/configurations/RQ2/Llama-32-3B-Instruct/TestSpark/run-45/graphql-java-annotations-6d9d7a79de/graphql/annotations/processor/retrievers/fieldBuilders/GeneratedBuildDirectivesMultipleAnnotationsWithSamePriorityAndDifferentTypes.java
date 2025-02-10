package graphql.annotations.processor.retrievers.fieldBuilders;

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
import java.util.stream.Collectors;

import org.junit.Test;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuildDirectivesMultipleAnnotationsWithSamePriorityAndDifferentTypes {

    @Test
    public void buildDirectivesMultipleAnnotationsWithSamePriorityAndDifferentTypes() {
        GraphQLDirectives directives = new GraphQLDirectives();
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        object.getClass().getMethod("directives", graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives.class)
                .invoke(object, directives);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder builder = new DirectivesBuilder(object, container);
        List<GraphQLDirective> result = builder.build();
        assert !result.isEmpty() && result.size() == 2;
    }

}