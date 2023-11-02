package com.github.foundryhq.cohere4j.response;

public class Meta {
    ApiVersion api_version;

    public static class ApiVersion {
        String version;
    }

    public String getApiVersion() {
        return api_version.version;
    }
}
