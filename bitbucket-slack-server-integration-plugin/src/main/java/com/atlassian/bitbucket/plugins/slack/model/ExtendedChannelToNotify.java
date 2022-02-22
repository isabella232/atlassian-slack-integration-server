package com.atlassian.bitbucket.plugins.slack.model;

import com.atlassian.plugins.slack.api.notification.ChannelToNotify;
import lombok.Value;

import java.util.Optional;

@Value
public class ExtendedChannelToNotify {
    ChannelToNotify channel;
    String notificationKey;
    Optional<Integer> userId;
}
