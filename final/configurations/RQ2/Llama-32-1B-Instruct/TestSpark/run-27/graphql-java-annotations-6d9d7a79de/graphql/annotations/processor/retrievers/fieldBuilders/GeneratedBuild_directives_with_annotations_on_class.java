package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuild_directives_with_annotations_on_class {

    @Override
    public GraphQLDirective[] build() {
        return newDirective(new GraphQLArgument("directives", GraphQLType.TypeBuilder.ofString(), Arrays.asList(
                "directives"
        )));
    }

    public DirectivesBuilder build(String directives) {
        AnnotatedElement object = new AnnotatedElement(DirectivesBuilder.class, "build", null);
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        return new DirectivesBuilderImpl(object, container).build(directives);
    }

    @Test
    public void build_directives_with_annotations_on_class() {
        AnnotatedElement annotatedObj = new AnnotatedElement(DirectivesBuilder.class, "build", null);
        DirectiveJavaAnnotationUtil.execute(annotatedObj);
        Object obj = newDirective().build();
        assertEquals("directives", (String) obj.getClass().getDeclaredFields()[0].getModifiers());
    }

}