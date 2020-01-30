package com.github.romankh3.awslambda.template;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Template for AWS Lambda.
 */
public class AwsLambdaTemplate implements RequestHandler<String, Boolean> {

    @Override
    public Boolean handleRequest(String input, Context context) {
        return input.isEmpty();
    }
}
