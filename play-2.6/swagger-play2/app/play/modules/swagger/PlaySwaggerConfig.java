package play.modules.swagger;

import io.swagger.models.SecurityRequirement;
import io.swagger.models.auth.SecuritySchemeDefinition;

import java.util.List;
import java.util.Map;

public class PlaySwaggerConfig {

    String[] schemes;
    String title;
    String version;
    String description;
    String termsOfServiceUrl;
    String contact;
    String license;
    String licenseUrl;
    String filterClass;
    String host;
    String basePath;
    Map<String, SecuritySchemeDefinition> securityDefinition;
    List<SecurityRequirement> security;

    public String[] getSchemes() {
        return schemes;
    }

    public void setSchemes(String[] schemes) {
        this.schemes = schemes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getFilterClass() {
        return filterClass;
    }

    public void setFilterClass(String filterClass) {
        this.filterClass = filterClass;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public Map<String, SecuritySchemeDefinition> getSecurityDefinition() {
        return securityDefinition;
    }

    public void setSecurityDefinition(Map<String, SecuritySchemeDefinition> securityDefinition) {
        this.securityDefinition = securityDefinition;
    }

    public List<SecurityRequirement> getSecurity() {
        return security;
    }

    public void setSecurity(List<SecurityRequirement> security) {
        this.security = security;
    }
}
