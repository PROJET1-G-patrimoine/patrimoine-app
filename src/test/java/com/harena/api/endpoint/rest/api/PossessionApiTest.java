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

import com.harena.api.endpoint.rest.client.ApiException;
import com.harena.api.endpoint.rest.model.BadRequestException;
import com.harena.api.endpoint.rest.model.GetPatrimoinePossessions200Response;
import com.harena.api.endpoint.rest.model.InternalServerException;
import com.harena.api.endpoint.rest.model.PossessionAvecType;
import com.harena.api.endpoint.rest.model.ResourceNotFoundException;
import com.harena.api.endpoint.rest.model.TooManyRequestsException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for PossessionApi
 */
@Disabled
public class PossessionApiTest {

    private final PossessionApi api = new PossessionApi();

    
    /**
     * met à jour une possession d&#39;un patrimoine si le nom existe, sinon on le crée
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void crupdatePatrimoinePossessionsTest() throws ApiException {
        String nomPatrimoine = null;
        Integer page = null;
        Integer pageSize = null;
        GetPatrimoinePossessions200Response getPatrimoinePossessions200Response = null;
        GetPatrimoinePossessions200Response response = 
        api.crupdatePatrimoinePossessions(nomPatrimoine, page, pageSize, getPatrimoinePossessions200Response);
        
        // TODO: test validations
    }
    
    /**
     * effacer un patrimoine d&#39;une possession
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePatrimoinePossessionByNomTest() throws ApiException {
        String nomPatrimoine = null;
        String nomPossession = null;
        
        api.deletePatrimoinePossessionByNom(nomPatrimoine, nomPossession);
        
        // TODO: test validations
    }
    
    /**
     * obtenir la possession demandée
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatrimoinePossessionByNomTest() throws ApiException {
        String nomPatrimoine = null;
        String nomPossession = null;
        PossessionAvecType response = 
        api.getPatrimoinePossessionByNom(nomPatrimoine, nomPossession);
        
        // TODO: test validations
    }
    
    /**
     * obtenir une liste paginée des possessions d&#39;un patrimoine
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatrimoinePossessionsTest() throws ApiException {
        String nomPatrimoine = null;
        Integer page = null;
        Integer pageSize = null;
        GetPatrimoinePossessions200Response response = 
        api.getPatrimoinePossessions(nomPatrimoine, page, pageSize);
        
        // TODO: test validations
    }
    
}
