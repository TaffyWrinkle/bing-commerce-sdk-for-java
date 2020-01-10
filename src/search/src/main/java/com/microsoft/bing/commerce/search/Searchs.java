/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bing.commerce.search;

import com.microsoft.bing.commerce.search.models.CommerceSearchPostRequest;
import com.microsoft.bing.commerce.search.models.CommerceSearchResponse;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Searchs.
 */
public interface Searchs {
    /**
     * Bing Commerce Custom Search Query.
     * POST requests accept complex search request options.
     *
     * @param body the CommerceSearchPostRequest value
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CommerceSearchResponse object if successful.
     */
    CommerceSearchResponse post(CommerceSearchPostRequest body, String tenant, String index);

    /**
     * Bing Commerce Custom Search Query.
     * POST requests accept complex search request options.
     *
     * @param body the CommerceSearchPostRequest value
     * @param tenant the String value
     * @param index the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CommerceSearchResponse> postAsync(CommerceSearchPostRequest body, String tenant, String index, final ServiceCallback<CommerceSearchResponse> serviceCallback);

    /**
     * Bing Commerce Custom Search Query.
     * POST requests accept complex search request options.
     *
     * @param body the CommerceSearchPostRequest value
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<CommerceSearchResponse> postAsync(CommerceSearchPostRequest body, String tenant, String index);

    /**
     * Bing Commerce Custom Search Query.
     * POST requests accept complex search request options.
     *
     * @param body the CommerceSearchPostRequest value
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<ServiceResponse<CommerceSearchResponse>> postWithServiceResponseAsync(CommerceSearchPostRequest body, String tenant, String index);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CommerceSearchResponse object if successful.
     */
    CommerceSearchResponse get(String q, String tenant, String index);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CommerceSearchResponse> getAsync(String q, String tenant, String index, final ServiceCallback<CommerceSearchResponse> serviceCallback);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<CommerceSearchResponse> getAsync(String q, String tenant, String index);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<ServiceResponse<CommerceSearchResponse>> getWithServiceResponseAsync(String q, String tenant, String index);
    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @param mkt The market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     * @param setlang The language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     * @param select A comma-separated list of fields to return. unspecified or empty to select only _itemId, or `*` to select all fields.
     * @param orderby A comma-separated list of OData order syntax expressions.
     * @param top The maximum count of items to return for pagination. Default is 24.
     * @param skip The offset to the first item to return for pagination. Default is 0.
     * @param discoverfacets Default value is false. When true, requests a facet discovery aggregation.
     * @param alteration A boolean flag to enable or disable query alteration. Default is true.
     * @param debug the Boolean value
     * @param searchinstanceid A saved search instance configuration to apply to current request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CommerceSearchResponse object if successful.
     */
    CommerceSearchResponse get(String q, String tenant, String index, String mkt, String setlang, String select, String orderby, Integer top, Integer skip, Boolean discoverfacets, Boolean alteration, Boolean debug, String searchinstanceid);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @param mkt The market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     * @param setlang The language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     * @param select A comma-separated list of fields to return. unspecified or empty to select only _itemId, or `*` to select all fields.
     * @param orderby A comma-separated list of OData order syntax expressions.
     * @param top The maximum count of items to return for pagination. Default is 24.
     * @param skip The offset to the first item to return for pagination. Default is 0.
     * @param discoverfacets Default value is false. When true, requests a facet discovery aggregation.
     * @param alteration A boolean flag to enable or disable query alteration. Default is true.
     * @param debug the Boolean value
     * @param searchinstanceid A saved search instance configuration to apply to current request.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CommerceSearchResponse> getAsync(String q, String tenant, String index, String mkt, String setlang, String select, String orderby, Integer top, Integer skip, Boolean discoverfacets, Boolean alteration, Boolean debug, String searchinstanceid, final ServiceCallback<CommerceSearchResponse> serviceCallback);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @param mkt The market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     * @param setlang The language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     * @param select A comma-separated list of fields to return. unspecified or empty to select only _itemId, or `*` to select all fields.
     * @param orderby A comma-separated list of OData order syntax expressions.
     * @param top The maximum count of items to return for pagination. Default is 24.
     * @param skip The offset to the first item to return for pagination. Default is 0.
     * @param discoverfacets Default value is false. When true, requests a facet discovery aggregation.
     * @param alteration A boolean flag to enable or disable query alteration. Default is true.
     * @param debug the Boolean value
     * @param searchinstanceid A saved search instance configuration to apply to current request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<CommerceSearchResponse> getAsync(String q, String tenant, String index, String mkt, String setlang, String select, String orderby, Integer top, Integer skip, Boolean discoverfacets, Boolean alteration, Boolean debug, String searchinstanceid);

    /**
     * Bing Commerce Basic Search Query.
     * GET requests can search an index using only URL parameters. Only limited request options are available. GET requests will always do simple item search and support only a default facet discovery aggregation.
     *
     * @param q The query to match against all eligible fields.
     * @param tenant the String value
     * @param index the String value
     * @param mkt The market where the results come from. Thypically, `mkt` is the country where the user is making the request from.
     * @param setlang The language to use for user interface strings. You may specify the language using either a 2-letter or 4-letter code. Using 4-letter codes is preferred.
     * @param select A comma-separated list of fields to return. unspecified or empty to select only _itemId, or `*` to select all fields.
     * @param orderby A comma-separated list of OData order syntax expressions.
     * @param top The maximum count of items to return for pagination. Default is 24.
     * @param skip The offset to the first item to return for pagination. Default is 0.
     * @param discoverfacets Default value is false. When true, requests a facet discovery aggregation.
     * @param alteration A boolean flag to enable or disable query alteration. Default is true.
     * @param debug the Boolean value
     * @param searchinstanceid A saved search instance configuration to apply to current request.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CommerceSearchResponse object
     */
    Observable<ServiceResponse<CommerceSearchResponse>> getWithServiceResponseAsync(String q, String tenant, String index, String mkt, String setlang, String select, String orderby, Integer top, Integer skip, Boolean discoverfacets, Boolean alteration, Boolean debug, String searchinstanceid);

}
