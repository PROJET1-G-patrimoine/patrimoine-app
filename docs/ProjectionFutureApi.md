# ProjectionFutureApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPatrimoineFluxImpossibles**](ProjectionFutureApi.md#getPatrimoineFluxImpossibles) | **GET** /patrimoines/{nom_patrimoine}/flux-impossibles | obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée |
| [**getPatrimoineFluxImpossiblesWithHttpInfo**](ProjectionFutureApi.md#getPatrimoineFluxImpossiblesWithHttpInfo) | **GET** /patrimoines/{nom_patrimoine}/flux-impossibles | obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée |
| [**getPatrimoineGraph**](ProjectionFutureApi.md#getPatrimoineGraph) | **GET** /patrimoines/{nom_patrimoine}/graphe | obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée |
| [**getPatrimoineGraphWithHttpInfo**](ProjectionFutureApi.md#getPatrimoineGraphWithHttpInfo) | **GET** /patrimoines/{nom_patrimoine}/graphe | obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée |



## getPatrimoineFluxImpossibles

> GetPatrimoineFluxImpossibles200Response getPatrimoineFluxImpossibles(nomPatrimoine, debut, fin)

obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.ProjectionFutureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProjectionFutureApi apiInstance = new ProjectionFutureApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        java.time.LocalDate debut = new java.time.LocalDate(); // java.time.LocalDate | 
        java.time.LocalDate fin = new java.time.LocalDate(); // java.time.LocalDate | 
        try {
            GetPatrimoineFluxImpossibles200Response result = apiInstance.getPatrimoineFluxImpossibles(nomPatrimoine, debut, fin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectionFutureApi#getPatrimoineFluxImpossibles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nomPatrimoine** | **String**| nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a | |
| **debut** | **java.time.LocalDate**|  | [optional] |
| **fin** | **java.time.LocalDate**|  | [optional] |

### Return type

[**GetPatrimoineFluxImpossibles200Response**](GetPatrimoineFluxImpossibles200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | flux impossibles du patrimoine actuel selon une plage de date donnée |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPatrimoineFluxImpossiblesWithHttpInfo

> ApiResponse<GetPatrimoineFluxImpossibles200Response> getPatrimoineFluxImpossibles getPatrimoineFluxImpossiblesWithHttpInfo(nomPatrimoine, debut, fin)

obtenir une liste des flux impossibles du patrimoine dans une intervalle donnée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.ProjectionFutureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProjectionFutureApi apiInstance = new ProjectionFutureApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        java.time.LocalDate debut = new java.time.LocalDate(); // java.time.LocalDate | 
        java.time.LocalDate fin = new java.time.LocalDate(); // java.time.LocalDate | 
        try {
            ApiResponse<GetPatrimoineFluxImpossibles200Response> response = apiInstance.getPatrimoineFluxImpossiblesWithHttpInfo(nomPatrimoine, debut, fin);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectionFutureApi#getPatrimoineFluxImpossibles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nomPatrimoine** | **String**| nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a | |
| **debut** | **java.time.LocalDate**|  | [optional] |
| **fin** | **java.time.LocalDate**|  | [optional] |

### Return type

ApiResponse<[**GetPatrimoineFluxImpossibles200Response**](GetPatrimoineFluxImpossibles200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | flux impossibles du patrimoine actuel selon une plage de date donnée |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPatrimoineGraph

> byte[] getPatrimoineGraph(nomPatrimoine, debut, fin)

obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.ProjectionFutureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProjectionFutureApi apiInstance = new ProjectionFutureApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        java.time.LocalDate debut = new java.time.LocalDate(); // java.time.LocalDate | 
        java.time.LocalDate fin = new java.time.LocalDate(); // java.time.LocalDate | 
        try {
            byte[] result = apiInstance.getPatrimoineGraph(nomPatrimoine, debut, fin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectionFutureApi#getPatrimoineGraph");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nomPatrimoine** | **String**| nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a | |
| **debut** | **java.time.LocalDate**|  | [optional] |
| **fin** | **java.time.LocalDate**|  | [optional] |

### Return type

**byte[]**


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | image montrant l&#39;évolution du graphe |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPatrimoineGraphWithHttpInfo

> ApiResponse<byte[]> getPatrimoineGraph getPatrimoineGraphWithHttpInfo(nomPatrimoine, debut, fin)

obtenir le graphe de projection d&#39;un patrimoine sur une plage de date donnée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.ProjectionFutureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProjectionFutureApi apiInstance = new ProjectionFutureApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        java.time.LocalDate debut = new java.time.LocalDate(); // java.time.LocalDate | 
        java.time.LocalDate fin = new java.time.LocalDate(); // java.time.LocalDate | 
        try {
            ApiResponse<byte[]> response = apiInstance.getPatrimoineGraphWithHttpInfo(nomPatrimoine, debut, fin);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectionFutureApi#getPatrimoineGraph");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **nomPatrimoine** | **String**| nom du patrimoine avec les espaces remplacés par \&quot;_\&quot; s&#39;il y en a | |
| **debut** | **java.time.LocalDate**|  | [optional] |
| **fin** | **java.time.LocalDate**|  | [optional] |

### Return type

ApiResponse<**byte[]**>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | image montrant l&#39;évolution du graphe |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

