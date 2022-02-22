package com.atlassian.bitbucket.plugins.slack.model;

import com.atlassian.plugins.slack.api.notification.Verbosity;
import lombok.Value;

import java.util.Optional;

@Value
public class NotificationRenderingOptions {
    Verbosity verbosity;
    boolean isPersonal;
    Optional<Integer> userId;
}
