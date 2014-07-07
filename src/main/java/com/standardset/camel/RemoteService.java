package com.standardset.camel;


/**
 * Defines a simple interface that a client will invoke and a service will implement
 */
public interface RemoteService {
    public String getText(String input);
}
