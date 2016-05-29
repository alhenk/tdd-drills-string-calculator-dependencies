package com.epam.engx.drills.calculator;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

/**
 * @author Nurmakanov
 */
public class AdaptParameterRequestProcessor {

    public Map<String, List<String>> process(HttpServletRequest req) throws IOException {
        Map<String, List<String>> paramNameToValues = new HashMap<>();
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String[] paramValues = req.getParameterValues(paramName);
            paramNameToValues.put(paramName, Arrays.asList(paramValues));
        }
        return paramNameToValues;
    }


}
