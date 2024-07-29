# PatrimoineApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**crupdatePatrimoines**](PatrimoineApi.md#crupdatePatrimoines) | **PUT** /patrimoines | met à jour les patrimoines si le nom est donné, sinon on le crée |
| [**crupdatePatrimoinesWithHttpInfo**](PatrimoineApi.md#crupdatePatrimoinesWithHttpInfo) | **PUT** /patrimoines | met à jour les patrimoines si le nom est donné, sinon on le crée |
| [**getPatrimoineByNom**](PatrimoineApi.md#getPatrimoineByNom) | **GET** /patrimoines/{nom_patrimoine} | obtenir le patrimoine demandé |
| [**getPatrimoineByNomWithHttpInfo**](PatrimoineApi.md#getPatrimoineByNomWithHttpInfo) | **GET** /patrimoines/{nom_patrimoine} | obtenir le patrimoine demandé |
| [**getPatrimoines**](PatrimoineApi.md#getPatrimoines) | **GET** /patrimoines | obtenir une liste paginée des patrimoines |
| [**getPatrimoinesWithHttpInfo**](PatrimoineApi.md#getPatrimoinesWithHttpInfo) | **GET** /patrimoines | obtenir une liste paginée des patrimoines |



## crupdatePatrimoines

> GetPatrimoines200Response crupdatePatrimoines(getPatrimoines200Response)

met à jour les patrimoines si le nom est donné, sinon on le crée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        GetPatrimoines200Response getPatrimoines200Response = new GetPatrimoines200Response(); // GetPatrimoines200Response | 
        try {
            GetPatrimoines200Response result = apiInstance.crupdatePatrimoines(getPatrimoines200Response);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#crupdatePatrimoines");
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
| **getPatrimoines200Response** | [**GetPatrimoines200Response**](GetPatrimoines200Response.md)|  | [optional] |

### Return type

[**GetPatrimoines200Response**](GetPatrimoines200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | liste de patrimoines créés ou mis à jour |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## crupdatePatrimoinesWithHttpInfo

> ApiResponse<GetPatrimoines200Response> crupdatePatrimoines crupdatePatrimoinesWithHttpInfo(getPatrimoines200Response)

met à jour les patrimoines si le nom est donné, sinon on le crée

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        GetPatrimoines200Response getPatrimoines200Response = new GetPatrimoines200Response(); // GetPatrimoines200Response | 
        try {
            ApiResponse<GetPatrimoines200Response> response = apiInstance.crupdatePatrimoinesWithHttpInfo(getPatrimoines200Response);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#crupdatePatrimoines");
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
| **getPatrimoines200Response** | [**GetPatrimoines200Response**](GetPatrimoines200Response.md)|  | [optional] |

### Return type

ApiResponse<[**GetPatrimoines200Response**](GetPatrimoines200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | liste de patrimoines créés ou mis à jour |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPatrimoineByNom

> Patrimoine getPatrimoineByNom(nomPatrimoine)

obtenir le patrimoine demandé

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        try {
            Patrimoine result = apiInstance.getPatrimoineByNom(nomPatrimoine);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#getPatrimoineByNom");
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

### Return type

[**Patrimoine**](Patrimoine.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | le patrimoine demandé |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPatrimoineByNomWithHttpInfo

> ApiResponse<Patrimoine> getPatrimoineByNom getPatrimoineByNomWithHttpInfo(nomPatrimoine)

obtenir le patrimoine demandé

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        String nomPatrimoine = "nomPatrimoine_example"; // String | nom du patrimoine avec les espaces remplacés par \"_\" s'il y en a
        try {
            ApiResponse<Patrimoine> response = apiInstance.getPatrimoineByNomWithHttpInfo(nomPatrimoine);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#getPatrimoineByNom");
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

### Return type

ApiResponse<[**Patrimoine**](Patrimoine.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | le patrimoine demandé |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |


## getPatrimoines

> GetPatrimoines200Response getPatrimoines(page, pageSize)

obtenir une liste paginée des patrimoines

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            GetPatrimoines200Response result = apiInstance.getPatrimoines(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#getPatrimoines");
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
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

[**GetPatrimoines200Response**](GetPatrimoines200Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | liste paginée de patrimoines |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

## getPatrimoinesWithHttpInfo

> ApiResponse<GetPatrimoines200Response> getPatrimoines getPatrimoinesWithHttpInfo(page, pageSize)

obtenir une liste paginée des patrimoines

### Example

```java
// Import classes:
import com.harena.api.endpoint.rest.client.ApiClient;
import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.client.ApiResponse;
import com.harena.api.endpoint.rest.client.Configuration;
import com.harena.api.endpoint.rest.client.models.*;
import com.harena.api.endpoint.rest.api.PatrimoineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PatrimoineApi apiInstance = new PatrimoineApi(defaultClient);
        Integer page = 56; // Integer | 
        Integer pageSize = 56; // Integer | 
        try {
            ApiResponse<GetPatrimoines200Response> response = apiInstance.getPatrimoinesWithHttpInfo(page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PatrimoineApi#getPatrimoines");
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
| **page** | **Integer**|  | [optional] |
| **pageSize** | **Integer**|  | [optional] |

### Return type

ApiResponse<[**GetPatrimoines200Response**](GetPatrimoines200Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | liste paginée de patrimoines |  -  |
| **400** | Bad request |  -  |
| **404** | Not found |  -  |
| **429** | Too many requests to the API |  -  |
| **500** | Internal server error |  -  |

