package org.wso2.carbon.apimgt.api;

import org.wso2.carbon.apimgt.api.model.ServiceEntry;

import java.util.List;

public interface ServiceCatalogApi {

    /**
     * Adds a new Service Catalog
     *
     * @param serviceEntry ServiceCatalogInfo
     * @param tenantId       Tenant Identifier
     * @return ServiceCatalogId UUID of the created Service Catalog ID
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    String addService(ServiceEntry serviceEntry, int tenantId) throws APIManagementException;

    /**
     * Update an existing Service Catalog
     *
     * @param serviceEntry ServiceCatalogInfo
     * @param tenantId       Tenant Identifier
     * @return ServiceCatalogId UUID of the created Service Catalog ID
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    String updateService(ServiceEntry serviceEntry, int tenantId) throws APIManagementException;

    /**
     * Returns details of an Service Catalog
     *
     * @param serviceCatalogId ServiceCatalog Identifier
     * @param tenantId         Tenant Identifier
     * @return An ServiceCatalogInfo object related to the given identifier or null
     * @throws APIManagementException if failed to get details of an Service Catalog
     */
    ServiceEntry getServiceByUUID(String serviceCatalogId, int tenantId)
            throws APIManagementException;

    /**
     * Deletes an Service Catalog
     *
     * @param serviceCatalogUuid ServiceCatalog Identifier(UUID)
     * @throws APIManagementException if failed to delete the Service Catalog
     */
    void deleteService(String serviceCatalogUuid) throws APIManagementException;

    /**
     * Returns details of all Service Catalogs belong to a given tenant
     *
     * @param tenantId Tenant Identifier
     * @return A list of ServiceCatalogInfo objects
     * @throws APIManagementException if failed to get details of Service Catalogs
     */
    List<ServiceEntry> getService(int tenantId) throws APIManagementException;

    /**
     * Adds a new end-point definition
     *
     * @param serviceCatalog End-point related information from ServiceCatalogEntry
     * @return ServiceCatalogId UUID of the created Service Catalog ID
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    String addEndPointDefinition(ServiceEntry serviceEntry, String uuid) throws APIManagementException;

    /**
     * Get MD5 hash value of a service endpoint
     *
     * @param serviceEntry EndPoint related information
     * @return ServiceCatalogInfo Endpoint information with md5 hash value
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    ServiceEntry getMD5Hash(ServiceEntry serviceEntry, int tenantId) throws APIManagementException;

    /**
     * Get MD5 hash value of a service endpoint
     *
     * @param key Service key unique to each tenant
     * @return ServiceCatalogInfo Endpoint information with md5 hash value
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    String getMD5HashByKey(String key, int tenantId) throws APIManagementException;

    /**
     * Get metadata and endpoint definition resources of a service endpoint
     *
     * @param key Service key unique to each tenant
     * @param tenantId Tenant Identifier
     * @return EndPointInfo Endpoint resources
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    ServiceEntry getEndPointResourcesByKey(String key, int tenantId) throws APIManagementException;

    /**
     * Get information of a service endpoint by key
     *
     * @param key Service key unique to each tenant
     * @param tenantId Tenant Identifier
     * @return ServiceCatalogInfo object including endpoint information
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    ServiceEntry getServiceByKey(String key, int tenantId) throws APIManagementException;

    /**
     * Get metadata and endpoint definition resources of a service endpoint
     *
     * @param name Service name
     * @param version Version of service
     * @param tenantId Tenant Identifier
     * @return EndPointInfo Endpoint resources
     * @throws APIManagementException if failed to add ServiceCatalogInfo
     */
    ServiceEntry getEndPointResourcesByNameAndVersion(String name, String version, int tenantId) throws APIManagementException;
}
