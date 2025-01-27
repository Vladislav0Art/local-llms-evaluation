package graphql.annotations.processor.retrievers.fieldBuilders;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

public class GeneratedBuild_DirectiveListWithArguments_ReturnsCorrectArray {

    @Test
    public void build_DirectiveListWithArguments_ReturnsCorrectArray() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilder builder = new DirectivesBuilder(object, container);

        GraphQLArgument argument1 = DirectiveJavaAnnotationUtil.createDirectivesArg("arg1");
        GraphQLDirective directive1 = newDirective(DirectiveType.ARGUMENTS).directive(arg1).build();

        GraphQLArgument argument2 = DirectiveJavaAnnotationUtil.createDirectivesArg("arg2");
        GraphQLDirective directive2 = newDirective(DirectiveType.OTHER).directive(argument2).build();

        builder.build(directive1, directive2);

        GraphQLDirective[] result = builder.build();
        assertEquals(2, result.length);
    }

}