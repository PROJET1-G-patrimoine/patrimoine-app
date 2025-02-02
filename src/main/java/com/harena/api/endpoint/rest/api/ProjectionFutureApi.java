/*
 * harena
 * harena
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.harena.api.endpoint.rest.api;

import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Pair;

import com.harena.api.endpoint.rest.model.BadRequestException;
import java.util.Date;
import com.harena.api.endpoint.rest.model.GetPatrimoineFluxImpossibles200Response;
import com.harena.api.endpoint.rest.model.InternalServerException;
import com.harena.api.endpoint.rest.model.ResourceNotFoundException;
import com.harena.api.endpoint.rest.model.TooManyRequestsException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-29T12:58:40.550938700+01:00[GMT+01:00]", comments = "Generator version: 7.7.0")
public class ProjectionFutureApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public ProjectionFutureApi() {
    this(new ApiClient());
  }

  public ProjectionFutureApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée
   * 
   * @param nomPatrimoine nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a (required)
   * @param debut  (optional)
   * @param fin  (optional)
   * @return GetPatrimoineFluxImpossibles200Response
   * @throws ApiException if fails to make API call
   */
  public GetPatrimoineFluxImpossibles200Response getPatrimoineFluxImpossibles(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    ApiResponse<GetPatrimoineFluxImpossibles200Response> localVarResponse = getPatrimoineFluxImpossiblesWithHttpInfo(nomPatrimoine, debut, fin);
    return localVarResponse.getData();
  }

  /**
   * obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée
   * 
   * @param nomPatrimoine nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a (required)
   * @param debut  (optional)
   * @param fin  (optional)
   * @return ApiResponse&lt;GetPatrimoineFluxImpossibles200Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetPatrimoineFluxImpossibles200Response> getPatrimoineFluxImpossiblesWithHttpInfo(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPatrimoineFluxImpossiblesRequestBuilder(nomPatrimoine, debut, fin);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getPatrimoineFluxImpossibles", localVarResponse);
        }
        return new ApiResponse<GetPatrimoineFluxImpossibles200Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetPatrimoineFluxImpossibles200Response>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getPatrimoineFluxImpossiblesRequestBuilder(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    // verify the required parameter 'nomPatrimoine' is set
    if (nomPatrimoine == null) {
      throw new ApiException(400, "Missing the required parameter 'nomPatrimoine' when calling getPatrimoineFluxImpossibles");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/patrimoines/{nom_patrimoine}/flux-impossibles"
        .replace("{nom_patrimoine}", ApiClient.urlEncode(nomPatrimoine.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "debut";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("debut", debut));
    localVarQueryParameterBaseName = "fin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fin", fin));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée
   * 
   * @param nomPatrimoine nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a (required)
   * @param debut  (optional)
   * @param fin  (optional)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getPatrimoineGraph(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getPatrimoineGraphWithHttpInfo(nomPatrimoine, debut, fin);
    return localVarResponse.getData();
  }

  /**
   * obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée
   * 
   * @param nomPatrimoine nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a (required)
   * @param debut  (optional)
   * @param fin  (optional)
   * @return ApiResponse&lt;byte[]&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[]> getPatrimoineGraphWithHttpInfo(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getPatrimoineGraphRequestBuilder(nomPatrimoine, debut, fin);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getPatrimoineGraph", localVarResponse);
        }
        return new ApiResponse<byte[]>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<byte[]>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getPatrimoineGraphRequestBuilder(String nomPatrimoine, java.time.LocalDate debut, java.time.LocalDate fin) throws ApiException {
    // verify the required parameter 'nomPatrimoine' is set
    if (nomPatrimoine == null) {
      throw new ApiException(400, "Missing the required parameter 'nomPatrimoine' when calling getPatrimoineGraph");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/patrimoines/{nom_patrimoine}/graphe"
        .replace("{nom_patrimoine}", ApiClient.urlEncode(nomPatrimoine.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "debut";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("debut", debut));
    localVarQueryParameterBaseName = "fin";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("fin", fin));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "image/png, application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
