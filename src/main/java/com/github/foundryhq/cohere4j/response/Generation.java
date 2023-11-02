package com.github.foundryhq.cohere4j.response;

import java.util.List;

public class Generation {
    private String id;
    private String text;
    private Integer index;
    private Double likelihood;
    private List<Likelihood> token_likelihoods;

    public String getText() {
        return text;
    }
}
