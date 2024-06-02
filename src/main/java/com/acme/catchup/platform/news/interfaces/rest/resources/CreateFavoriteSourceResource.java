package com.acme.catchup.platform.news.interfaces.rest.resources;

public record CreateFavoriteSourceResource(String newsApiKey, String sourceId) {
    public CreateFavoriteSourceResource {
        if (newsApiKey == null) {
            throw new IllegalArgumentException("newsApiKey cannot be null");
        }
        if (sourceId == null) {
            throw new IllegalArgumentException("sourceId cannot be null");
        }
    }
}
