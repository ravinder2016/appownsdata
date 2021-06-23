// ----------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.
// Licensed under the MIT license.
// ----------------------------------------------------------------------------

package com.embedsample.appownsdata.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

/**
 * Configuration class
 */
@Configuration
public class Config {

  // Set this to true, to show debug statements in console
  public static final boolean DEBUG = true;


  //	Two possible Authentication methods:
  //	- For authentication with master user credential choose MasterUser as AuthenticationType.
  //	- For authentication with app secret choose ServicePrincipal as AuthenticationType.
  //	More details here: https://aka.ms/EmbedServicePrincipal
  @Value("${powerBI.reports.authorizationTyp}")
  private String assignedAuthenticationType;

  //	Common configuration properties for both authentication types
  // Enter workspaceId / groupId
  @Value("${powerBI.reports.workspaceId}")
  private String assignedWorkspaceId;

  // The id of the report to embed.
  @Value("${powerBI.reports.reportId}")
  private String assignedReportId;

  // Enter Application Id / Client Id
  @Value("${powerBI.reports.clientId}")
  private String assignedClientId;

  // Enter MasterUser credentials
  public static final String pbiUsername = "";
  public static final String pbiPassword = "";

  @Value("${powerBI.reports.tenantId}")
  private String assignedTenantId;

  @Value("${powerBI.reports.appSecret}")
  private String assignedAppSecret;

  //	DO NOT CHANGE
  @Value("${powerBI.reports.authorityurl}")
  private String assignedAuthorityUrl;

  @Value("${powerBI.reports.scopeUrl}")
  private String assignedScopeUrl;

  public static String scopeUrl;
  public static String authorityUrl;

  public static String appSecret;

  public static String tenantId;

  public static String clientId;

  public static String reportId;

  public static String workspaceId;

  public static String authenticationType;

  @PostConstruct
  public void init(){
    scopeUrl = assignedScopeUrl;
    authorityUrl= assignedAuthorityUrl;
    appSecret = assignedAppSecret;
    tenantId = assignedTenantId;
    clientId = assignedClientId;
    reportId = assignedReportId;
    workspaceId = assignedWorkspaceId;
    authenticationType = assignedAuthenticationType;
  }

}