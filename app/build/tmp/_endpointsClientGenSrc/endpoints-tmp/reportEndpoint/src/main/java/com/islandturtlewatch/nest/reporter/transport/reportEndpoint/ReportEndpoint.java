/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-10-08 17:45:39 UTC)
 * on 2020-04-29 at 02:31:22 UTC 
 * Modify at your own risk.
 */

package com.islandturtlewatch.nest.reporter.transport.reportEndpoint;

/**
 * Service definition for ReportEndpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ReportEndpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ReportEndpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.25.0 of the reportEndpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://static-sentinel-567.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "reportEndpoint/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public ReportEndpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  ReportEndpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "createReport".
   *
   * This request holds the parameters needed by the reportEndpoint server.  After setting any
   * optional parameters, call the {@link CreateReport#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest}
   * @return the request
   */
  public CreateReport createReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest content) throws java.io.IOException {
    CreateReport result = new CreateReport(content);
    initialize(result);
    return result;
  }

  public class CreateReport extends ReportEndpointRequest<com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse> {

    private static final String REST_PATH = "createReport";

    /**
     * Create a request for the method "createReport".
     *
     * This request holds the parameters needed by the the reportEndpoint server.  After setting any
     * optional parameters, call the {@link CreateReport#execute()} method to invoke the remote
     * operation. <p> {@link
     * CreateReport#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest}
     * @since 1.13
     */
    protected CreateReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest content) {
      super(ReportEndpoint.this, "POST", REST_PATH, content, com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse.class);
    }

    @Override
    public CreateReport setAlt(java.lang.String alt) {
      return (CreateReport) super.setAlt(alt);
    }

    @Override
    public CreateReport setFields(java.lang.String fields) {
      return (CreateReport) super.setFields(fields);
    }

    @Override
    public CreateReport setKey(java.lang.String key) {
      return (CreateReport) super.setKey(key);
    }

    @Override
    public CreateReport setOauthToken(java.lang.String oauthToken) {
      return (CreateReport) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateReport setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateReport) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateReport setQuotaUser(java.lang.String quotaUser) {
      return (CreateReport) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateReport setUserIp(java.lang.String userIp) {
      return (CreateReport) super.setUserIp(userIp);
    }

    @Override
    public CreateReport set(String parameterName, Object value) {
      return (CreateReport) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "deleteReport".
   *
   * This request holds the parameters needed by the reportEndpoint server.  After setting any
   * optional parameters, call the {@link DeleteReport#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef}
   * @return the request
   */
  public DeleteReport deleteReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef content) throws java.io.IOException {
    DeleteReport result = new DeleteReport(content);
    initialize(result);
    return result;
  }

  public class DeleteReport extends ReportEndpointRequest<com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse> {

    private static final String REST_PATH = "report";

    /**
     * Create a request for the method "deleteReport".
     *
     * This request holds the parameters needed by the the reportEndpoint server.  After setting any
     * optional parameters, call the {@link DeleteReport#execute()} method to invoke the remote
     * operation. <p> {@link
     * DeleteReport#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef}
     * @since 1.13
     */
    protected DeleteReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef content) {
      super(ReportEndpoint.this, "POST", REST_PATH, content, com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse.class);
    }

    @Override
    public DeleteReport setAlt(java.lang.String alt) {
      return (DeleteReport) super.setAlt(alt);
    }

    @Override
    public DeleteReport setFields(java.lang.String fields) {
      return (DeleteReport) super.setFields(fields);
    }

    @Override
    public DeleteReport setKey(java.lang.String key) {
      return (DeleteReport) super.setKey(key);
    }

    @Override
    public DeleteReport setOauthToken(java.lang.String oauthToken) {
      return (DeleteReport) super.setOauthToken(oauthToken);
    }

    @Override
    public DeleteReport setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (DeleteReport) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public DeleteReport setQuotaUser(java.lang.String quotaUser) {
      return (DeleteReport) super.setQuotaUser(quotaUser);
    }

    @Override
    public DeleteReport setUserIp(java.lang.String userIp) {
      return (DeleteReport) super.setUserIp(userIp);
    }

    @Override
    public DeleteReport set(String parameterName, Object value) {
      return (DeleteReport) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "fetchReport".
   *
   * This request holds the parameters needed by the reportEndpoint server.  After setting any
   * optional parameters, call the {@link FetchReport#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef}
   * @return the request
   */
  public FetchReport fetchReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef content) throws java.io.IOException {
    FetchReport result = new FetchReport(content);
    initialize(result);
    return result;
  }

  public class FetchReport extends ReportEndpointRequest<com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReport> {

    private static final String REST_PATH = "fetchReport";

    /**
     * Create a request for the method "fetchReport".
     *
     * This request holds the parameters needed by the the reportEndpoint server.  After setting any
     * optional parameters, call the {@link FetchReport#execute()} method to invoke the remote
     * operation. <p> {@link
     * FetchReport#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef}
     * @since 1.13
     */
    protected FetchReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReportRef content) {
      super(ReportEndpoint.this, "POST", REST_PATH, content, com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.EncodedReport.class);
    }

    @Override
    public FetchReport setAlt(java.lang.String alt) {
      return (FetchReport) super.setAlt(alt);
    }

    @Override
    public FetchReport setFields(java.lang.String fields) {
      return (FetchReport) super.setFields(fields);
    }

    @Override
    public FetchReport setKey(java.lang.String key) {
      return (FetchReport) super.setKey(key);
    }

    @Override
    public FetchReport setOauthToken(java.lang.String oauthToken) {
      return (FetchReport) super.setOauthToken(oauthToken);
    }

    @Override
    public FetchReport setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (FetchReport) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public FetchReport setQuotaUser(java.lang.String quotaUser) {
      return (FetchReport) super.setQuotaUser(quotaUser);
    }

    @Override
    public FetchReport setUserIp(java.lang.String userIp) {
      return (FetchReport) super.setUserIp(userIp);
    }

    @Override
    public FetchReport set(String parameterName, Object value) {
      return (FetchReport) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getLatestRefsForUser".
   *
   * This request holds the parameters needed by the reportEndpoint server.  After setting any
   * optional parameters, call the {@link GetLatestRefsForUser#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public GetLatestRefsForUser getLatestRefsForUser() throws java.io.IOException {
    GetLatestRefsForUser result = new GetLatestRefsForUser();
    initialize(result);
    return result;
  }

  public class GetLatestRefsForUser extends ReportEndpointRequest<com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.CollectionResponseEncodedReportRef> {

    private static final String REST_PATH = "latestRefsForUser";

    /**
     * Create a request for the method "getLatestRefsForUser".
     *
     * This request holds the parameters needed by the the reportEndpoint server.  After setting any
     * optional parameters, call the {@link GetLatestRefsForUser#execute()} method to invoke the
     * remote operation. <p> {@link GetLatestRefsForUser#initialize(com.google.api.client.googleapis.s
     * ervices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
     * after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetLatestRefsForUser() {
      super(ReportEndpoint.this, "GET", REST_PATH, null, com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.CollectionResponseEncodedReportRef.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetLatestRefsForUser setAlt(java.lang.String alt) {
      return (GetLatestRefsForUser) super.setAlt(alt);
    }

    @Override
    public GetLatestRefsForUser setFields(java.lang.String fields) {
      return (GetLatestRefsForUser) super.setFields(fields);
    }

    @Override
    public GetLatestRefsForUser setKey(java.lang.String key) {
      return (GetLatestRefsForUser) super.setKey(key);
    }

    @Override
    public GetLatestRefsForUser setOauthToken(java.lang.String oauthToken) {
      return (GetLatestRefsForUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetLatestRefsForUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetLatestRefsForUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetLatestRefsForUser setQuotaUser(java.lang.String quotaUser) {
      return (GetLatestRefsForUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetLatestRefsForUser setUserIp(java.lang.String userIp) {
      return (GetLatestRefsForUser) super.setUserIp(userIp);
    }

    @Override
    public GetLatestRefsForUser set(String parameterName, Object value) {
      return (GetLatestRefsForUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateReport".
   *
   * This request holds the parameters needed by the reportEndpoint server.  After setting any
   * optional parameters, call the {@link UpdateReport#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest}
   * @return the request
   */
  public UpdateReport updateReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest content) throws java.io.IOException {
    UpdateReport result = new UpdateReport(content);
    initialize(result);
    return result;
  }

  public class UpdateReport extends ReportEndpointRequest<com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse> {

    private static final String REST_PATH = "reportresponse";

    /**
     * Create a request for the method "updateReport".
     *
     * This request holds the parameters needed by the the reportEndpoint server.  After setting any
     * optional parameters, call the {@link UpdateReport#execute()} method to invoke the remote
     * operation. <p> {@link
     * UpdateReport#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest}
     * @since 1.13
     */
    protected UpdateReport(com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportRequest content) {
      super(ReportEndpoint.this, "PUT", REST_PATH, content, com.islandturtlewatch.nest.reporter.transport.reportEndpoint.model.ReportResponse.class);
    }

    @Override
    public UpdateReport setAlt(java.lang.String alt) {
      return (UpdateReport) super.setAlt(alt);
    }

    @Override
    public UpdateReport setFields(java.lang.String fields) {
      return (UpdateReport) super.setFields(fields);
    }

    @Override
    public UpdateReport setKey(java.lang.String key) {
      return (UpdateReport) super.setKey(key);
    }

    @Override
    public UpdateReport setOauthToken(java.lang.String oauthToken) {
      return (UpdateReport) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateReport setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateReport) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateReport setQuotaUser(java.lang.String quotaUser) {
      return (UpdateReport) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateReport setUserIp(java.lang.String userIp) {
      return (UpdateReport) super.setUserIp(userIp);
    }

    @Override
    public UpdateReport set(String parameterName, Object value) {
      return (UpdateReport) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link ReportEndpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link ReportEndpoint}. */
    @Override
    public ReportEndpoint build() {
      return new ReportEndpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ReportEndpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setReportEndpointRequestInitializer(
        ReportEndpointRequestInitializer reportendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(reportendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
