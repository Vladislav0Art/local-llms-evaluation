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
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static graphql.schema.GraphQLDirective.newDirective;
import static graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_EmptyDirectivesList_ExpectEmptyArray {

    @Test
    public void build_EmptyDirectivesList_ExpectEmptyArray() {
        AnnotatedElement element = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(element, container);
        GraphQLDirective[] result = builder.build();
        assert result.length == 0;
    }

}