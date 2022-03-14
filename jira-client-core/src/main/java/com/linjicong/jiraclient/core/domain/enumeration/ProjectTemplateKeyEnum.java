package com.linjicong.jiraclient.core.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProjectTemplateKeyEnum {
    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_KANBAN("com.pyxis.greenhopper.jira:gh-simplified-agility-kanban"),

    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_AGILITY_SCRUM("com.pyxis.greenhopper.jira:gh-simplified-agility-scrum"),

    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_BASIC("com.pyxis.greenhopper.jira:gh-simplified-basic"),

    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_KANBAN_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-kanban-classic"),

    PYXIS_GREENHOPPER_JIRA_GH_SIMPLIFIED_SCRUM_CLASSIC("com.pyxis.greenhopper.jira:gh-simplified-scrum-classic"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_IT_SERVICE_MANAGEMENT("com.atlassian.servicedesk:simplified-it-service-management"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_GENERAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-general-service-desk"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_INTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-internal-service-desk"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_EXTERNAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-external-service-desk"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_HR_SERVICE_DESK("com.atlassian.servicedesk:simplified-hr-service-desk"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_FACILITIES_SERVICE_DESK("com.atlassian.servicedesk:simplified-facilities-service-desk"),

    ATLASSIAN_SERVICEDESK_SIMPLIFIED_LEGAL_SERVICE_DESK("com.atlassian.servicedesk:simplified-legal-service-desk"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_CONTENT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-content-management"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_DOCUMENT_APPROVAL("com.atlassian.jira-core-project-templates:jira-core-simplified-document-approval"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_LEAD_TRACKING("com.atlassian.jira-core-project-templates:jira-core-simplified-lead-tracking"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCESS_CONTROL("com.atlassian.jira-core-project-templates:jira-core-simplified-process-control"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROCUREMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-procurement"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_PROJECT_MANAGEMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-project-management"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_RECRUITMENT("com.atlassian.jira-core-project-templates:jira-core-simplified-recruitment"),

    ATLASSIAN_JIRA_CORE_PROJECT_TEMPLATES_JIRA_CORE_SIMPLIFIED_TASK_("com.atlassian.jira-core-project-templates:jira-core-simplified-task-");

    private String value;

    ProjectTemplateKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectTemplateKeyEnum fromValue(String value) {
      for (ProjectTemplateKeyEnum b : ProjectTemplateKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
