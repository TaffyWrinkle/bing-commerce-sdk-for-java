// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.

/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search.implementation;

import com.microsoft.bing.commerce.search.BingCommerceSearch;
import com.microsoft.bing.commerce.search.Searchs;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Initializes a new instance of the BingCommerceSearch class.
 */
public class BingCommerceSearchImpl extends ServiceClient implements BingCommerceSearch {

    /**
     * The Searchs object to access its operations.
     */
    private Searchs searchs;

    /**
     * Gets the Searchs object to access its operations.
     * @return the Searchs object.
     */
    public Searchs searchs() {
        return this.searchs;
    }

    /**
     * Initializes an instance of BingCommerceSearch client.
     */
    public BingCommerceSearchImpl() {
        this("https://commerce.bing.com/api/search/v1");
    }

    /**
     * Initializes an instance of BingCommerceSearch client.
     *
     * @param baseUrl the base URL of the host
     */
    public BingCommerceSearchImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of BingCommerceSearch client.
     *
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public BingCommerceSearchImpl(OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        this("https://commerce.bing.com/api/search/v1", clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of BingCommerceSearch client.
     *
     * @param baseUrl the base URL of the host
     * @param clientBuilder the builder for building an OkHttp client, bundled with user configurations
     * @param restBuilder the builder for building an Retrofit client, bundled with user configurations
     */
    public BingCommerceSearchImpl(String baseUrl, OkHttpClient.Builder clientBuilder, Retrofit.Builder restBuilder) {
        super(baseUrl, clientBuilder, restBuilder);
        initialize();
    }

    /**
     * Initializes an instance of BingCommerceSearch client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public BingCommerceSearchImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.searchs = new SearchsImpl(retrofit(), this);
    }
}
